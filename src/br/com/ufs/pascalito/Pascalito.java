package br.com.ufs.pascalito;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Writer;
import java.text.MessageFormat;

import br.com.ufs.pascalito.exception.PascalitoException;
import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.extensions.lexer.PascalitoLexer;
import br.com.ufs.pascalito.lexer.LexerException;
import br.com.ufs.pascalito.node.EOF;
import br.com.ufs.pascalito.node.InvalidToken;
import br.com.ufs.pascalito.node.TBlank;
import br.com.ufs.pascalito.node.Token;

public class Pascalito {
	private static final int PUSHBACK_BUFFER_LENGTH = 1024;
	
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.err.println("Uso: java br.com.ufs.pascalito.Pascalito <arquivo>");
			System.exit(-1);
		}
		
		PushbackReader reader = new PushbackReader(new FileReader(args[0]), PUSHBACK_BUFFER_LENGTH);
		File outFile = new File(args[0] + ".out");
		FileWriter writer = new FileWriter(outFile);
		try {
			PascalitoLexer lexer = new PascalitoLexer(reader);
			printTokens(lexer, writer);
			System.out.println("Sintaxe válida! Saída salva no arquivo " + outFile.getAbsolutePath());
		} catch (PascalitoLexerException e) {
			String template = "[Linha {0}, Pos {1}]: {2}";
			InvalidToken invalidToken = e.getInvalidToken();
			System.err.println(MessageFormat.format(template, invalidToken.getLine(), invalidToken.getPos(), e.getMessage()));
			System.err.println(invalidToken.getText());
		} catch (PascalitoException e) {
			e.printStackTrace();
		} finally {
			reader.close();
			writer.close();
		}
	}
	
	private static void printTokens(PascalitoLexer lexer, Writer writer) throws IOException {
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
				writer.write(text);
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