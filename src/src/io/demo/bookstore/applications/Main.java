package src.io.demo.bookstore.applications;

import src.io.demo.bookstore.entities.Author;
import src.io.demo.bookstore.entities.Book;
import src.io.demo.bookstore.entities.Ebook;
import src.io.demo.bookstore.entities.Maganize;
import src.io.demo.bookstore.entities.ShoppingCart;
import src.io.demo.bookstore.entities.PocketBook;
import src.io.demo.bookstore.entities.PrintedBook;
import src.io.demo.bookstore.entities.PublishingCompany;

public class Main {

	public static void main(String[] args) {

		Author author = new Author("Silva", "1010", "silva@silva");
		PrintedBook java8 = new PrintedBook("Java8", "Guia Pr�tico", 42.90, "202020", author);

		Author author2 = new Author("Maria", "4040", "maria@silva");
		Ebook java17 = new Ebook("Java17", "Guia Atualizado", 21.69, "101010", author2);

		Book javaPocket = new PocketBook("MiniJava", "Ultra-avancado", 500.60, "000-00", author2);

		java17.applyDiscountFrom(30);
		java8.applyDiscountFrom10Percent();

		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.add(java8);
		shoppingCart.add(java17);
		shoppingCart.add(javaPocket);
		System.out.printf("Total: R$%.2f%n", shoppingCart.getTotalValue());

		/* Revista */

		PublishingCompany PublishingCompany = new PublishingCompany("La crise", "ltda", "ltda");
		Maganize maganize = new Maganize("Lo Dev", "Where are they?", 10.99, PublishingCompany);

		maganize.applyDiscountFrom(30);
		shoppingCart.add(maganize);

		shoppingCart.remove(0);

		System.out.printf("Total: R$%.2f", shoppingCart.getTotalValue());

	}

}
