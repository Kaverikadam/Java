package com.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="root123";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection established successfully");
			
			Emp e1=new Emp(11, "Rani", 20);
			Emp e2=new Emp(12,"Ramu",30);
			Emp e3=new Emp(13,"Rakesh",40);
			
			
			e1.insert(con);
			e2.insert(con);
			e3.insert(con);
			e1.showData(con);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
