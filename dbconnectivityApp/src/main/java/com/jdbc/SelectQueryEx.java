package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectQueryEx {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
//					String sql="select * from employee1";
//					PreparedStatement pst=con.prepareStatement(sql);
//					
//					
//				ResultSet rs=pst.executeQuery();
//				
//				while(rs.next())
			String sql="select * from employee1 where id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("Enter id:");
			int id=sc.nextInt();
			pst.setInt(1, id); //101
			
	ResultSet rs=pst.executeQuery();
		
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