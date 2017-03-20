package br.com.ufs.pascalito.extensions.lexer;

import java.io.IOException;
import java.io.PushbackReader;

import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.lexer.Lexer;
import br.com.ufs.pascalito.lexer.LexerException;
import br.com.ufs.pascalito.node.EOF;
import br.com.ufs.pascalito.node.InvalidToken;
import br.com.ufs.pascalito.node.TComentBloco;
import br.com.ufs.pascalito.node.TComentBlocoFim;

public class PascalitoLexer extends Lexer {
	
	private int count;
	private StringBuffer text;
	private TComentBloco comentBloco;
	
	public PascalitoLexer(PushbackReader in) {
		super(in);
	}
	
	@Override
	protected void filter() throws LexerException, IOException {
		if (state.equals(State.COMMENT)) {
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
		} else if (state.equals(State.NORMAL)) {
			if (token instanceof TComentBlocoFim) {
				throw new PascalitoLexerException(new InvalidToken(token.getText(), token.getLine(), token.getPos()), "Fim de comentário de bloco inválido");
			}
		}
	}
}