package br.com.ufs.pascalito;

import java.io.IOException;
import java.io.PushbackReader;

import br.com.ufs.pascalito.exception.PascalitoException;
import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.extensions.lexer.PascalitoLexer;
import br.com.ufs.pascalito.lexer.LexerException;
import br.com.ufs.pascalito.node.EOF;
import br.com.ufs.pascalito.node.TBlank;
import br.com.ufs.pascalito.node.Token;

public class PascalitoLexico extends PascalitoCompiler {
	
	public void realizarAnaliseLexica(String[] args) throws IOException {
		PushbackReader reader = createPushbackReader(args);
		try {
			PascalitoLexer lexer = new PascalitoLexer(reader);
			printTokens(lexer);
			System.out.println();
		} catch (PascalitoLexerException e) {
			tratarErroLexico(e);
		} catch (PascalitoException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}
	
	private void printTokens(PascalitoLexer lexer) throws IOException {
		try {
			Token token = lexer.next();
			Token lastToken = null;
			while (!(token instanceof EOF)) {
				String text;
				if (token instanceof TBlank) {
					text = token.getText();
				} else {
					text = extractTokenName(token.getClass().getSimpleName());
				}
				if (lastToken != null && !(token instanceof TBlank) && !(lastToken instanceof TBlank)) {
					text = " " + text;
				}
				System.out.print(text);
				lastToken = token;
				token = lexer.next();
			}
		} catch (LexerException e) {
			throw new PascalitoLexerException(e.getToken(), "Token desconhecido");
		}
	}
	
	private String extractTokenName(String tokenClassName) {
		StringBuilder sb = new StringBuilder(tokenClassName);
		if (sb.charAt(0) == 'T') {
			sb.delete(0, 1);
		}
		sb.replace(0, 1, sb.substring(0, 1).toLowerCase());
		for (int i = 1; i < sb.length(); i++) {
			if (Character.isUpperCase(sb.charAt(i))) {
				String replacement = "_" + Character.toLowerCase(sb.charAt(i));
				sb.replace(i, i+1, replacement);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		PascalitoLexico lexico = new PascalitoLexico();
		lexico.validarArgumentos(args);
		lexico.realizarAnaliseLexica(args);
	}
}