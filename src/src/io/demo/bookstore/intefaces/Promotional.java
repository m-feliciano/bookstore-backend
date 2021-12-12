package src.io.demo.bookstore.intefaces;

@FunctionalInterface
public interface Promotional {

	boolean applyDiscountFrom(double porcentagem);

	default boolean applyDiscountFrom10Percent() {
		return applyDiscountFrom(10);
	}
}
