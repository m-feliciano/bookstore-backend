package src.io.demo.bookstore.intefaces;

public interface Product extends Comparable<Product> {

	String getName();

	double getValue();

	String getDescription();

	String getIsbn();

}
