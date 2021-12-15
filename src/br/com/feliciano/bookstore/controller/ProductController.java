package br.com.feliciano.bookstore.controller;

import java.sql.Connection;

import br.com.feliciano.bookstore.infra.dao.ProductDAO;
import br.com.feliciano.bookstore.intefaces.Product;
import br.com.feliciano.bookstore.util.ConnectionFactory;
import javafx.collections.ObservableList;

public class ProductController {

    private final ProductDAO productDAO;

    public ProductController() {
        Connection conn = new ConnectionFactory().getConnection();
        this.productDAO = new ProductDAO(conn);
    }
    
    public ObservableList<Product> list() {
    	return productDAO.list();
    }
}
