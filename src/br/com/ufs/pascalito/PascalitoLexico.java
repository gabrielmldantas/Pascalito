package br.com.ufs.pascalito;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.text.MessageFormat;

import br.com.ufs.pascalito.exception.PascalitoException;
import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.extensions.lexer.PascalitoLexer;
import br.com.ufs.pascalito.lexer.LexerException;
import br.com.ufs.pascalito.node.EOF;
import br.com.ufs.pascalito.node.InvalidToken;
import br.com.ufs.pascalito.node.TBlank;
import br.com.ufs.pascalito.node.Token;

public class PascalitoLexico {
	private static final int PUSHBACK_BUFFER_LENGTH = 1024;
	
	public static void main(String[] args) throws IOException {
		if (args.length < 2 || (!args[0].equals("-i") && !args[0].equals("-f")) || (args[0].equals("-f") && args.length > 2)) {
			System.err.println("Uso: java br.com.ufs.pascalito.PascalitoLexico -f <arquivo> "
					+ "ou java br.com.ufs.pascalito.PascalitoLexico -i <programa>");
			System.exit(-1);
		}
		
		PushbackReader reader = createPushbackReader(args);
		try {
			PascalitoLexer lexer = new PascalitoLexer(reader);
			printTokens(lexer);
			System.out.println();
		} catch (PascalitoLexerException e) {
			String template = "[Linha {0}, Pos {1}]: {2}";
			InvalidToken invalidToken = e.getInvalidToken();
			System.err.println(MessageFormat.format(template, invalidToken.getLine(), invalidToken.getPos(), e.getMessage()));
			System.err.println(invalidToken.getText());
		} catch (PascalitoException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}
	
	private static PushbackReader createPushbackReader(String[] args) throws FileNotFoundException {
		if (args[0].equals("-i")) {
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i < args.length; i++) {
				builder.append(args[i]);
			}
			
			return new PushbackReader(new StringReader(builder.toString()), PUSHBACK_BUFFER_LENGTH);
		} else {
			return new PushbackReader(new FileReader(args[1]), PUSHBACK_BUFFER_LENGTH);
		}
	}
	
	private static void printTokens(PascalitoLexer lexer) throws IOException {
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
	
	private static String extractTokenName(String tokenClassName) {
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
}