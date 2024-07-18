package com.JDBCDemo;

import java.sql.*;
import java.util.Scanner;

public class MyJDBC {
	
	static Scanner scan=new Scanner(System.in);
	public void insert(Connection con) {
		
		try {
			System.out.println("Enter Student Roll no");
			int rollNo=scan.nextInt();
			System.out.println("Enter student name : ");
			String name=scan.next();
			System.out.println("Enter student age : ");
			int age=scan.nextInt();
			String insertQuery="insert into Student values(?,?,?)";
			
			PreparedStatement pstmt= con.prepareStatement(insertQuery);
			pstmt.setInt(1, rollNo);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.execute();
			System.out.println("Insertion is Completed");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(Connection con) {
		try {
			System.out.println("Enter RollNo which you want to delete");
			int rollNo=scan.nextInt();
			String deleteQuery="delete from Student where rollNo=?";
			PreparedStatement pstmt= con.prepareStatement(deleteQuery);
			pstmt.setInt(1, rollNo);
			
			pstmt.execute();
			System.out.println("Deletion is  Completed");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Connection con) {
		
		try {
			System.out.println("Enter rollNo who's name you want to Update");
			int rollNo=scan.nextInt();
			System.out.println("Enter Name ");
			String name=scan.next();
			String updateQuery="update Student set name=? where rollNo=?";
			PreparedStatement pstmt= con.prepareStatement(updateQuery);
			pstmt.setInt(2, rollNo);
			pstmt.setString(1, name);
			
			pstmt.execute();
			System.out.println("Updation is Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void select(Connection con) {
		try {
			System.out.println("Student data");
			String selectQuery="select * from Student";
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(selectQuery);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
