package com.JDBCDemo;

import java.sql.*;
import java.util.Scanner;

public class Employee {
	static Scanner scan=new Scanner(System.in);
	public void insert(Connection con) {
		System.out.println("Enter number of Records you want to insert");
		int row=scan.nextInt();
		for(int i=1;i<=row;i++) {
			try {
				System.out.println("Enter Employee ID");
				int empId=scan.nextInt();
				System.out.println("Enter Emplyee name : ");
				String name=scan.next();
				System.out.println("Enter Employee age : ");
				int age=scan.nextInt();
				String insertQuery="insert into Employee values(?,?,?)";
				
				PreparedStatement pstmt= con.prepareStatement(insertQuery);
				pstmt.setInt(1, empId);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.execute();
				System.out.println("Insertion is Completed");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(Connection con) {
		try {
			System.out.println("Enter empId which you want to delete");
			int empId=scan.nextInt();
			String deleteQuery="delete from Employee where empId=?";
			PreparedStatement pstmt= con.prepareStatement(deleteQuery);
			pstmt.setInt(1, empId);
			
			pstmt.execute();
			System.out.println("Deletion is  Completed");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Connection con) {
		
	}
	public void fetchData(Connection con) {
		
		try {
			System.out.println("Enter the empid who's data you want ");
			int id=scan.nextInt();
			String selectQuery="select * from Employee ";
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
//stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
//ResultSet rs=stmt.executeQuery("select * from emp765");  
//  
////getting the record of 3rd row  
//rs.absolute(3);  
//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
//  
//con.close();  
