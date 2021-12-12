package src.io.demo.bookstore.entities;

import src.io.demo.bookstore.intefaces.Product;
import src.io.demo.bookstore.intefaces.Promotional;

public class Maganize implements Product, Promotional {

	private String name, description;
	private double value;
	private PublishingCompany PublishingCompany;

	public Maganize(String name, String description, double value,
			PublishingCompany PublishingCompany) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
		this.PublishingCompany = PublishingCompany;
	}

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

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public PublishingCompany getPublishingCompany() {
		return PublishingCompany;
	}

	public void setPublishingCompany(PublishingCompany PublishingCompany) {
		this.PublishingCompany = PublishingCompany;
	}

	@Override
	public boolean applyDiscountFrom(double desc) {
		int limite = 30;
		if (desc <= limite) {
			System.out.println("Magazine discount applied");
			this.setValue(this.getValue() - (this.getValue() * desc / 100));
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Maganize [name=" + name + ", description=" + description + ", value=" + value + ", publishingCompany="
				+ PublishingCompany + "]";
	}

}
