package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBConnection {

	public static void main(String[] args) {
		// Loading the Drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection establish
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b667", "root", "root");
//			Statement stm = con.createStatement();
//			int n = stm.executeUpdate("delete from student where sno = 2");
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
