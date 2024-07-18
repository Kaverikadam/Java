package com.JDBCDemo;

import java.sql.*;
import java.util.Scanner;

public class MyJDBCApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="root123";
		try {
			//Step 2 : Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			//Step 3: Establishing the connection
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection established");
			
			MyJDBC jdbc=new MyJDBC();
			int i=1;
			while(i==1) {
				
				System.out.println("Which operation you want to perform\n");
				System.out.println("1) Insert\n"
						+ "2) Delete\n"
						+ "3) Update\n"
						+ "4) Select\n");
				
				int choice=scan.nextInt();
				
				switch(choice) {
					case 1 :jdbc.insert(con);
							break;
					case 2 :jdbc.delete(con);
							break;
					case 3 :jdbc.update(con);
							break;
					case 4 :jdbc.select(con);
							break;
					default :System.out.println("You enterd wrong choice");
				}
				System.out.println("Do you want to continuee Press 1 otherwise press 0");
				i=scan.nextInt();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	}

}
