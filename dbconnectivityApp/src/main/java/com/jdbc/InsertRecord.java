package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		
		try(Connection con=DatabaseConnection.getDbConnection())
		{
			//static query- you know values at the compilation time,need to use statement
			
			Statement st=con.createStatement();
			
			String query="insert into employee1 values(101,'chayan','chayan@gmail.com',25000)";
			
			int row=st.executeUpdate(query);
			System.out.println(row+ "record inserted successfully");
			
		}catch (SQLException e) {
			System.out.println(e);
			
		}
		

	}

}
