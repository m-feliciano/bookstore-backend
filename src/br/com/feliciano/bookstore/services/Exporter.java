package br.com.feliciano.bookstore.services;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import br.com.feliciano.bookstore.intefaces.Product;

public class Exporter {

	public void toCSV(List<Product> products) {

		try (PrintStream ps = new PrintStream("product.csv")) {
			ps.println("Name, Description, Price, ISBN");
			for (Product prod : products) {
				ps.println(String.format("%s, %s, %s, %s", 
						prod.getName(), 
						prod.getDescription(), 
						prod.getPrice(),
						prod.getIsbn())
						);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
