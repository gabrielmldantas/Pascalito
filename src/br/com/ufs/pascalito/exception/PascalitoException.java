package br.com.ufs.pascalito.exception;

public class PascalitoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PascalitoException() {
	}

	public PascalitoException(String message) {
		super(message);
	}

	public PascalitoException(String message, Throwable cause) {
		super(message, cause);
	}

	public PascalitoException(Throwable cause) {
		super(cause);
	}
}