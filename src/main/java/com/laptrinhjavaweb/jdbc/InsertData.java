package com.laptrinhjavaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbctutorial";
		String username = "root";
		String password = "1234";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO student (code, fullname, address, score) VALUES ('123', 'lap trinh java web 2', 'HCM', 10)";
			
			System.out.println("Insert student success!");
			
		} catch (SQLException e) {
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					System.out.println("Error: "+e.getMessage());
				}
			}
			System.out.println("Error: "+e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.out.println("Error: "+e.getMessage());
			}
		}
	}
}
