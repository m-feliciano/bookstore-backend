package src.io.demo.livraria.intefaces;

@FunctionalInterface
public interface Promotional {

	boolean applyDiscountFrom(double porcentagem);

	default boolean applyDiscountFrom10Percent() {
		return applyDiscountFrom(10);
	}
}
