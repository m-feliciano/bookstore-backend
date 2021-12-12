package src.io.demo.bookstore.entities;

import src.io.demo.bookstore.intefaces.Promotional;

public class Ebook extends Book implements Promotional {

	public Ebook(String name, String description, double value, String isbn, Author author) {
		super(name, description, value, isbn, author);
		// TODO Auto-generated constructor stub
	}

	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public boolean applyDiscountFrom(double desc) {
		int limit = 30;
		if (desc <= limit) {
			System.out.println("E-book discount applied\r\n");
			this.setValue(this.getValue() - (this.getValue() * desc / 100));
			return true;
		}
		return false;
	}

}
