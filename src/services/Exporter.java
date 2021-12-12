package services;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import src.io.demo.bookstore.intefaces.Product;

public class Exporter {

	public void toCSV(List<Product> products) throws IOException {
		PrintStream ps = new PrintStream("product.csv");
		ps.println("Name, Description, Value, ISBN");

		for (Product product : products) {
			ps.println(String.format(
					"%s, %s, %s, %s", 
					product.getName(), 
					product.getDescription(), 
					product.getValue(),
					product.getIsbn()));
		}
		ps.close();
	}

//	public static void main(String[] args) throws IOException {
//
//		Author author = new Author("Rodrigo Turini", "rodrigo.turini@caelum.com.br", 
//				"123.456.789.10");
//		Book book = new PrintedBook("Java 8 Prático", "Novos recursos da linguagem", 
//				59.90, "978-85-66250-46-6", author);
//		Book book2 = new PrintedBook("Desbravando a O.O.", "Book de Java e O.O", 59.90, 
//				"321-54-67890-11-2", author);
//		new Exporter().toCSV(Arrays.asList(book, book2));
//
//	}
}
