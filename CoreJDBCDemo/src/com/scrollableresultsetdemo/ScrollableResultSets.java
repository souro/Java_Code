package com.scrollableresultsetdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSets {
	public static void main(String[] args) {
		try {
			// loads com.mysql.jdbc.Driver into memory
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException cnf) {
			System.out.println("Driver could not be loaded: " + cnf);
		}
		String connectionUrl = "jdbc:mysql://localhost:3306/SOURODB";
		String dbUser = "root";
		String dbPwd = "souro";
		Connection conn;
		ResultSet rs;
		String queryString = "SELECT EmpID,LastName,FirstName,Address,City FROM EMPLOYEE3";
		try {
			conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
			Statement stmt = conn
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			stmt.executeUpdate("CREATE TABLE EMPLOYEE3(EmpID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255))");
			stmt.executeUpdate("INSERT INTO EMPLOYEE3 (EmpID,LastName,FirstName,Address,City) VALUES ('1903','Mukherjee','Sourabrata','KartikNagar','Bangalore')");
			stmt.executeUpdate("INSERT INTO EMPLOYEE3 (EmpID,LastName,FirstName,Address,City) VALUES ('1904','Mukherjee','Sourabrata','Marathali','Bangalore')");
			rs = stmt.executeQuery(queryString);
			System.out.println("============");
			rs.absolute(2);
			System.out.println(rs.getInt(1) + ".\t" + rs.getString(2) + ".\t"
					+ rs.getString(4) + ".\t" + rs.getString(5) + ".\t"
					+ rs.getString(3));
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException sqle) {
			System.out.println("SQL Exception thrown: " + sqle);
		}
	}
}
