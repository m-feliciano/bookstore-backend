package br.com.feliciano.bookstore.entities;

import java.math.BigDecimal;

import br.com.feliciano.bookstore.intefaces.Promotional;

public class Ebook extends Book implements Promotional {

	public Ebook(String name, String description, BigDecimal value, String isbn, Author author) {
		super(name, description, value, isbn, author);
	}

	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public boolean applyDiscountOf(BigDecimal porcentage) {
		if (porcentage.compareTo(new BigDecimal("30")) > 0) {
			System.out.println("E-book discount applied\r\n");
			this.setValue(this.getPrice().subtract(this.getPrice().multiply(porcentage).divide(new BigDecimal("100"))));
			return true;
		}
		return false;
	}

}
