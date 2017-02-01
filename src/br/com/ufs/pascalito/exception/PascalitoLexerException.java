package br.com.ufs.pascalito.exception;

import br.com.ufs.pascalito.node.InvalidToken;

public class PascalitoLexerException extends PascalitoException {
	private static final long serialVersionUID = 1L;

	private InvalidToken invalidToken;
	
	public PascalitoLexerException(InvalidToken invalidToken, String message) {
		super(message);
		this.invalidToken = invalidToken;
	}

	public InvalidToken getInvalidToken() {
		return invalidToken;
	}
}