package src.io.demo.livraria.entities;

import src.io.demo.livraria.intefaces.Promotional;

public class printedBook extends Book implements Promotional {

	public printedBook(String name, String description, double value, String isbn, Author author) {
		super(name, description, value, isbn, author);
	}

	public double getPrintRate() {
		return this.getValue() * 0.05;
	}

	@Override
	public boolean applyDiscountFrom(double percentage) {
		int limite = 80;
		if (percentage <= limite) {
			System.out.println("Printed Book Discount Applied");
			this.setValue(this.getValue() - (this.getValue() * percentage / 100));
			return true;
		}
		return false;
	}

}
