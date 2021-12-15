package br.com.feliciano.bookstore.infra.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.feliciano.bookstore.entities.Author;
import br.com.feliciano.bookstore.entities.PrintedBook;
import br.com.feliciano.bookstore.intefaces.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductDAO {

	private final Connection conn;

	public ProductDAO(Connection conn) {
		this.conn = conn;
	}

	public ObservableList<Product> list() {

		ObservableList<Product> products = observableArrayList();
		String sql = "SELECT * FROM tb_product";
		try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				PrintedBook book = new PrintedBook(new Author());
				book.setName(resultSet.getString("name"));
				book.setDescription(resultSet.getString("description"));
				book.setValue(BigDecimal.valueOf(resultSet.getDouble("price")));
				book.setIsbn(resultSet.getString("isbn"));
				products.add(book);
			}
			return products;
		} catch (SQLException e1) {
			throw new RuntimeException();
		}
	}

	private ObservableList<Product> observableArrayList() {
		return FXCollections.observableArrayList();
	}

	public void addProduct(Product product) {

		String sql = "INSERT INTO tb_product (name, description, price, isbn) VALUES (?,?,?,?)";
		try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
			ps.setString(1, product.getName());
			ps.setString(2, product.getDescription());
			ps.setBigDecimal(3, product.getPrice());
			ps.setString(4, product.getIsbn());
			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
