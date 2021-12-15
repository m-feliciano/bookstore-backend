package br.com.feliciano.bookstore.exceptions;

public class NullAuthorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NullAuthorException(String message) {
		super(message);
	}

}
