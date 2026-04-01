package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class MySqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Main Method started");

		// Loading the Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Load Driver-----know the Driver Manager

		// Establish the Connection to Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Create ResultSet Object and retrieve the data
		String sql = "select * from emp";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println("***********************");
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getString(5));

		}
		// close all the Connections
		rs.close();
		stmt.close();
		con.close();

	}

}
