package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	static Connection con=null;
	//this method will create connection and return the connection object
	public static Connection getDbConnection()
	{
		try {
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//established the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip99", "root", "180219");
		
		}catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
