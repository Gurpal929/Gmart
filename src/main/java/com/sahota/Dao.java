package com.sahota;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	public Dao() throws ClassNotFoundException, SQLException {
		this.con = getConnection();
		System.out.println("Connection created");
	}

	private Connection con = null;

	// Creating method to connect to database
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://@localhost:3306/gmart", "root", "Root");

	}

	// Method for logging in user

	public boolean login(User u) throws SQLException {
		// getConnection();
		System.out.println("Enterd Login Method");
		
		PreparedStatement ps = con.prepareStatement("select UserName from login where UserName=? and pwd=?");
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			System.out.println("Enterd Login Method" + rs.getString(" UserName"));
			return true;
		} else {
			return false;

		}
	}



}
