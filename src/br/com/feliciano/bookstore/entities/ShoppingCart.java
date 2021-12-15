package br.com.feliciano.bookstore.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.feliciano.bookstore.intefaces.Product;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();

	public void add(Product product) {
		if (product == null)
			throw new IllegalArgumentException("Cannot add a nullable product: " + product);
		products.add(product);
		System.out.printf("added: %s | %.2f%n", product.getName(), product.getPrice());
	}

	public void remove(int position) {
		if (position < 0) {
			throw new IllegalArgumentException("Invalid position: " + position);
		}
		products.remove(position);
	}

	public BigDecimal getTotalValue() {
		return products.stream().map(Product::getPrice).reduce(BigDecimal::add).get();
	}

}
