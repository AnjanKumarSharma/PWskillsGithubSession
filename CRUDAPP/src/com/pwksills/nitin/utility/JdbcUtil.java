package com.pwksills.nitin.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public final class JdbcUtil {
	private static Properties properties = null;

	private JdbcUtil() {

	}

	static {
		FileInputStream fis = null;

		String fileInfo = "D:\\pwskillsOctbatch\\CRUDAPP\\src\\com\\pwskills\\nitin\\properties\\database.properties";
		try {
			fis = new FileInputStream(fileInfo);
			if (fis != null) {
				properties = new Properties();
				properties.load(fis);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static Connection getDBConection() throws IOException, SQLException {
		// 1. Establishing the Connection
		return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),
				properties.getProperty("password"));
	}

	public static void cleanUpResources(ResultSet resultSet, Statement statement, Connection connection) {
		// 5. Close the resources
		if (resultSet != null) {
			try {
				// Closing ResultSet
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (statement != null) {
			try {
				// Closing Statement
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				// Closing Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
