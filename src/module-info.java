module bookstore.backend {
	requires transitive java.sql;
	requires javafx.base;

	exports br.com.feliciano.bookstore.infra.dao to bookstore.javafx;
	exports br.com.feliciano.bookstore.intefaces to bookstore.javafx;
	exports br.com.feliciano.bookstore.services to bookstore.javafx;
	exports br.com.feliciano.bookstore.controller to bookstore.javafx;

	opens br.com.feliciano.bookstore.entities to javafx.base;
}