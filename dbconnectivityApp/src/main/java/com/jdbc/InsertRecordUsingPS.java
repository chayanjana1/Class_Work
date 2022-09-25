package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertRecordUsingPS {
public static void main(String[] args) {
		
		try(Connection con=DatabaseConnection.getDbConnection();
		Scanner sc=new Scanner(System.in))
		{
			String sql="insert into employee1 values(?,?,?,?)";
			//insert into employee values(102,'nil','nil@gmail.com',40000)
			
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter id:");
			int id=sc.nextInt(); //102
			sc.nextLine();
			
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			
			System.out.println("Enter email:");
			String email=sc.nextLine();
			
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			
			int r=ps.executeUpdate();
			System.out.println(r+ " record is inserted syccessfully");
			
}catch (SQLException e) {
	System.out.println(e);
}
}
}