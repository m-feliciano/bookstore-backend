/**
 *
 */
package br.com.feliciano.bookstore.entities;

import java.math.BigDecimal;

import br.com.feliciano.bookstore.exceptions.NullAuthorException;
import br.com.feliciano.bookstore.intefaces.Product;

public abstract class Book implements Product {

	private String name;
	private String description;
	private String isbn;
	private BigDecimal value;
	private Author author;

	protected Book(String name, String description, BigDecimal value, String isbn, Author author) {
		this.name = name;
		this.description = description;
		this.isbn = isbn;
		this.value = value;
		setAuthor(author);
	}
	protected Book(Author author) {
		setAuthor(author);
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public BigDecimal getPrice() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		if (author == null) {
			throw new NullAuthorException("O author nao pode ser nulo!");
		}
		this.author = author;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(this.getClass().getSimpleName())
				.append("[name= ")
				.append(name)
				.append(", description=")
				.append(description)
				.append(", isbn=")
				.append(isbn)
				.append(", value=")
				.append(value)			
				.append(", ")
				.append(author)
				.append("]")
				.toString();
	}

}
