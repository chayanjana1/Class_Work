package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class joiningClause {

	public static void main(String[] args) {
		try(Connection con=DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
//		Statement st=con.createStatement();
//			String query="create table account(Id int primary key auto_increment,accNum int,emp_id int,foreign key(emp_id) references employee1(id))";
//			
//			int row=st.executeUpdate(query);
//			System.out.println(row+" table is created successfully");
//		Statement st2=con.createStatement();
//			String q="insert into account(accNum,emp_id) values(267756,101)";
//			int row=st2.executeUpdate(q);
//			System.out.println(row+ " record inserted successfully");
//			
			Statement st3=con.createStatement();
//			String sql="select e.name,e.salary,a.accNum from employee1 e ,"
//					+ "account a where e.id=a.emp_id";
			String sql="select e.name,e.salary,a.accNum from employee1 e inner join "
					+ "account a on e.id=a.emp_id";
			ResultSet rs=st3.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println("employee name: "+ rs.getString("name"));
				System.out.println("employee salary: "+ rs.getString("salary"));
				System.out.println("employee number: "+ rs.getString("accNum"));
				System.out.println("=============================================");
				
			}
		}catch (SQLException e) {
			System.out.println(e);
		}

	}

}
