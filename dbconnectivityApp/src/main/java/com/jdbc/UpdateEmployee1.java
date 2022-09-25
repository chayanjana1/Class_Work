package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee1 {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			
			System.out.println("Enter email:");
			String email=sc.nextLine();
			
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			
			String query="update employee1 set name='"+name+"',email='"+email+"'," 
			+ "salary='"+salary+"' where id=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			System.out.println("Enter id:");
			int id=sc.nextInt(); //101
			
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			
		
		System.out.println(row+ " row is updated successfully");
		String query2="select * from employee1 where id='"+id+"'";
		PreparedStatement ps2=con.prepareStatement(query2);
		ResultSet rs=ps2.executeQuery();
		if(rs.next())
		{
			System.out.println("Employee Id: "+rs.getInt(1));
			System.out.println("Employee Name: "+rs.getString("name"));
			System.out.println("Employee email: "+rs.getString("email"));
			System.out.println("Employee salary: "+rs.getInt(4));
			System.out.println("===========================================");
			
		}
		else
			System.out.println("id not found");
	}catch (SQLException e) {
		System.out.println(e);
	}
	}
}
