/**
 *
 */
package src.io.demo.livraria.entities;

import src.io.demo.livraria.exceptions.NullAuthorException;
import src.io.demo.livraria.intefaces.Product;

public abstract class Book implements Product {

	private String name;
	private String description;
	private String isbn;
	private double value;
	private Author author;

	public Book(String name, String description, double value, String isbn, Author author) {
		super();
		this.name = name;
		this.description = description;
		this.isbn = isbn;
		this.value = value;
		setAutor(author);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAutor(Author author) {
		if (author == null) {
			throw new NullAuthorException("O author n�o pode ser nulo!");
		}
		this.author = author;
	}

	@Override
	public String toString() {
		return "{ name=" + name + ", description=" + description + ", isbn=" + isbn + ", value=" + value + ", autor="
				+ author + "}";
	}

}
