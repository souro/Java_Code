package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	/*
	 * static block is executed when a class is loaded into memory this block
	 * loads MySQL's JDBC driver
	 */
	static {
		try {
			// loads com.mysql.jdbc.Driver into memory
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException cnf) {
			System.out.println("Driver could not be loaded: " + cnf);
		}
	}

	public static void main(String[] args) {
		String connectionUrl = "jdbc:mysql://localhost:3306/SOURODB";
		String dbUser = "root";
		String dbPwd = "souro";
		Connection conn;
		ResultSet rs;
		String queryString = "SELECT EmpID,LastName,FirstName,Address,City FROM EMPLOYEE";
		try {
			conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("CREATE TABLE EMPLOYEE(EmpID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255))");
			stmt.executeUpdate("INSERT INTO EMPLOYEE (EmpID,LastName,FirstName,Address,City) VALUES ('1910','Mukherjee','Sourabrata','Kormongala','Bangalore')");
			rs = stmt.executeQuery(queryString);
			System.out.println("============");
			while (rs.next()) {
				System.out.print(rs.getInt("EmpID") + ".\t"
						+ rs.getString("LastName") + ".\t"
						+ rs.getString("FirstName") + ".\t"
						+ rs.getString("Address") + ".\t"
						+ rs.getString("City"));
				System.out.println();
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException sqle) {
			System.out.println("SQL Exception thrown: " + sqle);
		}
	}
}