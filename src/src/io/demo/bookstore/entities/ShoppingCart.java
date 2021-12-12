package src.io.demo.bookstore.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

import src.io.demo.bookstore.intefaces.Product;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();

	public void add(Product product) {
		if (product != null) {
			products.add(product);
			System.out.printf("added: %s | %.2f%n", product.getName(), product.getValue());
		} else {
			System.out.println("Product not added:" + product);
		}
	}

	public void remove(int position) {
		if (position >= 0) {
			products.remove(position);
		}
	}

	public double getTotalValue() {
//		Function<Produto, Double> valor = x -> x.getValue(); //classical method
		BinaryOperator<Double> sum = (x, y) -> x + y;
		return products.stream().map(Product::getValue) // method reference
				.reduce(sum).get();
	}

}
