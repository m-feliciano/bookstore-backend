package br.com.feliciano.bookstore.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			return DriverManager.getConnection(url, props);
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Properties loadProperties() throws IOException {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			System.out.println("cannot read file");
			throw new IOException();
		}
	}

}
