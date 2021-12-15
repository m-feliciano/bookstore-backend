package br.com.feliciano.bookstore.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.feliciano.bookstore.intefaces.Promotional;

public class PrintedBook extends Book implements Promotional {

	private boolean hadPromotionalDiscount = false;

	public PrintedBook(String name, String description, BigDecimal value, String isbn, Author author) {
		super(name, description, value, isbn, author);
	}

	public PrintedBook(Author author) {
		super(author);
		this.setAuthor(author);
	}

	public BigDecimal getPrintRate() {
		return this.getPrice().multiply(new BigDecimal("0.05")).setScale(2, RoundingMode.HALF_UP);
	}

	@Override
	public boolean applyDiscountOf(BigDecimal porcentagem) {
		synchronized (this) {
			if (hadPromotionalDiscount || porcentagem.compareTo(new BigDecimal("80")) > 0) {
				return false;
			}
			System.out.println("Printed Book Discount Applied");
			this.setValue(this.getPrice()
					.subtract(this.getPrice()
							.multiply(porcentagem)
							.divide(new BigDecimal("100")))
					.setScale(2, RoundingMode.HALF_UP));
			hadPromotionalDiscount = true;
			return true;
		}
	}

}
