package src.io.demo.livraria.entities;

import src.io.demo.livraria.intefaces.Product;
import src.io.demo.livraria.intefaces.Promotional;

public class Maganize implements Product, Promotional {

	private String name, description;
	private double value;
	private publishingCompany publishingCompany;

	public Maganize(String name, String description, double value,
			publishingCompany publishingCompany) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
		this.publishingCompany = publishingCompany;
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

	public publishingCompany getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(publishingCompany publishingCompany) {
		this.publishingCompany = publishingCompany;
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
				+ publishingCompany + "]";
	}

}
