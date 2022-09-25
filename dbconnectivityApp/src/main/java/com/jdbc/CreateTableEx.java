package com.jdbc;

import java.sql.Connection;

import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
		//try with resource
		try(Connection conn=DatabaseConnection.getDbConnection()){
		 
		 //create Statement
		 Statement st=conn.createStatement();
		 
		 //write/create quary
		 String sql="create table employee1(id int primary key,name varchar(50) not null,"
				  + "email varchar(70) not null,salary int not null)";
		 
		 //execute quary
		 st.executeUpdate(sql);
		 
		 System.out.println("Table created sucessfully!!");
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
//finally {
//	try {
//		conn.close();
//	} catch (Exception e2) {
//		
//	}
	}
}

