package br.com.feliciano.bookstore.intefaces;

import java.math.BigDecimal;

@FunctionalInterface
public interface Promotional {

	boolean applyDiscountOf(BigDecimal porcentagem);

	default boolean applyDiscountFrom10Percent() {
		return applyDiscountOf(new BigDecimal("10"));
	}
}
