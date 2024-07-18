package com.JDBCDemo;


//Step 1 : Importing java.sql packege
import java.sql.DriverManager;

public class LoadingTheDriverAndEstablishingConnection {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="root123";
		
		try {
			//Step 2 : Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			//Step 3: Establishing the connection
			
			DriverManager.getConnection(url,user,password);
			System.out.println("Connection established");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
