package br.com.ufs.pascalito;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PushbackReader;
import java.io.StringReader;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.node.InvalidToken;
import br.com.ufs.pascalito.node.Token;
import br.com.ufs.pascalito.parser.ParserException;

public abstract class PascalitoCompiler {
	private static final int PUSHBACK_BUFFER_LENGTH = 1024;
	
	protected void validarArgumentos(String[] args) {
		if (args.length < 2 || (!args[0].equals("-i") && !args[0].equals("-f")) || (args[0].equals("-f") && args.length > 2)) {
			System.err.println("Uso: java br.com.ufs.pascalito.PascalitoLexico -f <arquivo> "
					+ "ou java br.com.ufs.pascalito.PascalitoLexico -i <programa>");
			System.exit(-1);
		}
	}
	
	protected PushbackReader createPushbackReader(String[] args) throws FileNotFoundException {
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
	
	protected void tratarErroLexico(PascalitoLexerException lexerException) {
		String template = "[Linha {0}, Pos {1}]: {2}";
		InvalidToken invalidToken = lexerException.getInvalidToken();
		System.err.println(MessageFormat.format(template, invalidToken.getLine(), invalidToken.getPos(), lexerException.getMessage()));
		System.err.println(invalidToken.getText());
	}
	
	protected void tratarErroSintatico(ParserException parserException) {
		System.err.println("Sintaxe inválida!");
		String template = "[Linha {0}, Pos {1}]: Encontrado {2}, esperado {3}";
		Pattern pattern = Pattern.compile("\\[.*?\\] expecting: ");
		Matcher matcher = pattern.matcher(parserException.getMessage());
		String errorMessage = matcher.replaceAll("");
		Token token = parserException.getToken();
        System.err.println(MessageFormat.format(template, token.getLine(), token.getPos(), token.getText(), errorMessage));
	}
}
