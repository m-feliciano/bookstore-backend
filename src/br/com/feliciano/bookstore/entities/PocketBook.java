package br.com.feliciano.bookstore.entities;

import java.math.BigDecimal;

public class PocketBook extends Book {

	public PocketBook(String name, String description, BigDecimal value, String isbn, Author author) {
		super(name, description, value, isbn, author);
	}

}
