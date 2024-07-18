package com.JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bank {
	static Scanner scan=new Scanner(System.in);

	void insert(Connection con) {		
		try {
			System.out.print("Enter Bank ID of user : ");
			int bankId=scan.nextInt();
			
			System.out.print("Enter name of user : ");
			String name=scan.next();
			
			System.out.print("Enter balence of user : ");
			int balence=scan.nextInt();
			
			String query="insert into Bank values(?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, bankId);
			pstmt.setString(2, name);
			pstmt.setInt(3, balence);
			pstmt.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void update(Connection con) {
		System.out.println("choose the opration\n1) Bank ID change\n2) Change Name\n3) Update balance\n");
		int choice=scan.nextInt();
		
		switch(choice) {
			case 1:updateId(con);
				break;
			case 2:updateName(con);
				break;
			case 3:updateBalence(con);
				break;
			default:System.out.println("Invalid Choice");
		}		
	}
	 void updateId(Connection con) {
		 
		 try {
			 System.out.println("Enter user name who's Id you want to chance");
			 String name=scan.next();
			 System.out.println("Enter new Bank ID");
			 int id=scan.nextInt();
			 
			 String query="update Bank set bankid=? where name=?";
			 
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.execute();
			System.out.println("Bank ID changed successfully");
		} 
		 catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	 void updateName(Connection con) {
		 try {
			 System.out.println("Enter Bank Id who's name you want to change");
			 int id=scan.nextInt();
			
			 System.out.println("Enter new user name");
			 String name=scan.next();
			 
			 String query="update Bank set name=? where bankid=?";
			 
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(2, id);
			pstmt.setString(1, name);
			pstmt.execute();
			System.out.println("User name changed successfully");
		} 
		 catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 void updateBalence(Connection con) {
		 try {
			 System.out.println("Enter bank id who's balence you want update");
			 int id=scan.nextInt();
			 System.out.println("Enter Balence");
			 int balence=scan.nextInt();
			 
			 String query="update Bank set balence=? where bankId=?";
			 
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, balence);
			pstmt.setInt(2, id);
			pstmt.execute();
			System.out.println("Bank balence updated successfully");
		} 
		 catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 
	
	public void delete(Connection con) {
		
		try {
			System.out.println("Enter bank id you want to delete");
			int id=scan.nextInt();
			
			String query="delete from bank where bankId=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.execute();
			System.out.println(id+" deleted successfully");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void fetchData(Connection con) {
		
		try {
			System.out.println("Enter bank id of user");
			int bankId=scan.nextInt();
			String query="select * from bank where bankId=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, bankId);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("bankId");
	            String name = rs.getString("name");
	            int balence = rs.getInt("balence");
	            
	            System.out.println("Bank ID: " + id);
	            System.out.println("USer Name: " + name);
	            System.out.println("Bank Balance: " + balence);
			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
