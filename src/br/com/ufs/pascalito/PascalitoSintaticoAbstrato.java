package br.com.ufs.pascalito;

import java.io.IOException;
import java.io.PushbackReader;

import br.com.ufs.pascalito.exception.PascalitoException;
import br.com.ufs.pascalito.exception.PascalitoLexerException;
import br.com.ufs.pascalito.extensions.lexer.PascalitoLexer;
import br.com.ufs.pascalito.lexer.LexerException;
import br.com.ufs.pascalito.parser.Parser;
import br.com.ufs.pascalito.parser.ParserException;

public class PascalitoSintaticoAbstrato extends PascalitoCompiler {

	public void realizarAnaliseSintatica(String[] args) throws IOException {
		PushbackReader reader = createPushbackReader(args);
		try {
			PascalitoLexer lexer = new PascalitoLexer(reader);
			Parser parser = new Parser(lexer);
			parser.parse();
			System.out.println("Sintaxe válida!");
		} catch (PascalitoLexerException e) {
			tratarErroLexico(e);
		} catch (PascalitoException e) {
			e.printStackTrace();
		} catch (ParserException e) {
			tratarErroSintatico(e);
		} catch (LexerException e) {
			tratarErroLexico(new PascalitoLexerException(e.getToken(), "Token desconhecido"));
		} finally {
			reader.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		PascalitoSintaticoAbstrato sintatico = new PascalitoSintaticoAbstrato();
		sintatico.validarArgumentos(args);
		sintatico.realizarAnaliseSintatica(args);
	}
}
