package com.JDBCDemo;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class RetrivingData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="root123";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con= DriverManager.getConnection(url,user,password);
			System.out.println("Connection established");
			
			Statement stmt=con.createStatement();
			
//			stmt.execute("insert into Student values(6,'Komal',25)");
			
			ResultSet rs= stmt.executeQuery("select * from Student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

