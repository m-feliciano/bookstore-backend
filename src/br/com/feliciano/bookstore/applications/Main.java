package br.com.feliciano.bookstore.applications;

import java.math.BigDecimal;

import br.com.feliciano.bookstore.entities.Author;
import br.com.feliciano.bookstore.entities.Book;
import br.com.feliciano.bookstore.entities.Ebook;
import br.com.feliciano.bookstore.entities.Maganize;
import br.com.feliciano.bookstore.entities.PocketBook;
import br.com.feliciano.bookstore.entities.PrintedBook;
import br.com.feliciano.bookstore.entities.PublishingCompany;
import br.com.feliciano.bookstore.entities.ShoppingCart;

public class Main {

	public static void main(String[] args) {

		Author author = new Author("Silva", "1010", "silva@silva");
		PrintedBook java8 = new PrintedBook("Java8", "Guia Pr�tico",  new BigDecimal("42.90"), "202020", author);

		Author author2 = new Author("Maria", "4040", "maria@silva");
		Ebook java17 = new Ebook("Java17", "Guia Atualizado",  new BigDecimal("21.69"), "101010", author2);

		Book javaPocket = new PocketBook("MiniJava", "Ultra-avancado", new BigDecimal("500.60"), "000-00", author2);
		java17.applyDiscountOf(new BigDecimal("30"));
		java8.applyDiscountFrom10Percent();

		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.add(java8);
		shoppingCart.add(java17);
		shoppingCart.add(javaPocket);
		System.out.printf("Total: R$%.2f%n", shoppingCart.getTotalValue());

		PublishingCompany publishingCompany = new PublishingCompany("La crise", "ltda", "ltda");
		Maganize maganize = new Maganize("Lo Dev", "Where are they?",  new BigDecimal("10.99"), publishingCompany);
		maganize.applyDiscountOf(new BigDecimal("30"));
		shoppingCart.add(maganize);
		shoppingCart.remove(0);

		System.out.printf("Total: R$%.2f%n", shoppingCart.getTotalValue());
		System.out.println();
		
		
		System.out.println(java17);
		System.out.println(java8);
		System.out.println(javaPocket);
		
	}

}
