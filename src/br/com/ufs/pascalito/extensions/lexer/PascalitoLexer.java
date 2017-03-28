package br.com.ufs.pascalito.extensions.lexer;

import java.io.IOException;
import java.io.PushbackReader;

import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.lexer.Lexer;
import br.com.ufs.pascalito.lexer.LexerException;
import br.com.ufs.pascalito.node.EOF;
import br.com.ufs.pascalito.node.InvalidToken;
import br.com.ufs.pascalito.node.TAspaSimples;
import br.com.ufs.pascalito.node.TComentBloco;
import br.com.ufs.pascalito.node.TComentBlocoFim;
import br.com.ufs.pascalito.node.TConstString;
import br.com.ufs.pascalito.node.TNewline;
import br.com.ufs.pascalito.node.Token;

public class PascalitoLexer extends Lexer {
	
	private int count;
	private StringBuffer text;
	private TComentBloco comentBloco;
	private TConstString constString;
	
	public PascalitoLexer(PushbackReader in) {
		super(in);
	}
	
	@Override
	protected void filter() throws LexerException, IOException {
		if (state.equals(State.COMMENT)) {
			tratarComentario();
		} else if (state.equals(State.STRING)) {
			tratarString();
		} else if (state.equals(State.NORMAL)) {
			if (token instanceof TComentBlocoFim) {
				throw new PascalitoLexerException(new InvalidToken(token.getText(), token.getLine(), token.getPos()), "Fim de comentário de bloco inválido");
			} else if (token instanceof TConstString) {
				throw new PascalitoLexerException(new InvalidToken(token.getText(), token.getLine(), token.getPos()), "Fim de literal string inválido");
			}
		}
	}

	private void tratarString() throws IOException {
		if (constString == null) {
			constString = (TConstString) token;
			text = new StringBuffer(constString.getText());
			count = 1;
			token = null;
		} else if (token instanceof EOF || token instanceof TNewline) {
			throw new PascalitoLexerException(new InvalidToken(text.toString(), constString.getLine(), constString.getPos()), "Literal string desbalanceado");
		} else {
			// Se for aspa simples, dentro da string, aumenta o contador de balanceamento
			if (token instanceof TAspaSimples) {
				count++;
				if (count % 2 != 0) {
					text.append(token.getText());
				}
			} else {
				text.append(token.getText());
			}
			
			// Se o próximo token não é aspa simples e as aspas estão balanceadas, constroi o token ConstString, transita para o estado NORMAL e devolve o token para a entrada
			if (!(token instanceof TAspaSimples) && count % 2 == 0) {
				constString.setText(text.toString());
				Token oldToken = token;
				token = constString;
				state = State.NORMAL;
				constString = null;
				unread(oldToken);
				System.out.println(text.toString());
			} else {
				token = null;
			}
		}
	}

	private void tratarComentario() {
		if (comentBloco == null) {
			comentBloco = (TComentBloco) token;
			text = new StringBuffer(comentBloco.getText());
			count = 1;
			token = null;
		} else if (token instanceof EOF) {
			throw new PascalitoLexerException(new InvalidToken(text.toString(), comentBloco.getLine(), comentBloco.getPos()), "Comentário de bloco desbalanceado");
		} else {
			text.append(token.getText());
			if (token instanceof TComentBloco) {
				count++;
			} else if (token instanceof TComentBlocoFim) {
				count--;
			} 
			if (count != 0) {
				token = null;
			} else {
				comentBloco.setText(text.toString());
				token = comentBloco;
				state = State.NORMAL;
				comentBloco = null;
			}
		}
	}
}