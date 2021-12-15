package br.com.feliciano.bookstore.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.feliciano.bookstore.intefaces.Product;
import br.com.feliciano.bookstore.intefaces.Promotional;

public class Maganize implements Product, Promotional {

	private String name;
	private String description;
	private String isbn;
	private BigDecimal value;
	private PublishingCompany publishingCompany;

	public Maganize(String name, String description, BigDecimal value, PublishingCompany publishingCompany) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
		this.publishingCompany = publishingCompany;
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
	public BigDecimal getPrice() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public String getIsbn() {
		return isbn;
	}

	public PublishingCompany getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(PublishingCompany publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public boolean applyDiscountOf(BigDecimal porcentagem) {
		if (porcentagem.compareTo(new BigDecimal("30")) > 0) {
			System.out.println("Magazine discount applied\r\n");
			this.setValue(this.getPrice()
					.subtract(this.getPrice()
							.multiply(porcentagem)
							.divide(new BigDecimal("100")))
					.setScale(2, RoundingMode.HALF_UP));
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Maganize [name=" + name + ", description=" + description + ", value=" + value + ", publishingCompany="
				+ publishingCompany + "]";
	}

}
