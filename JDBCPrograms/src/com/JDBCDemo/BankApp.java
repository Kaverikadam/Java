package com.JDBCDemo;

import java.sql.*;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="root123";
		
		//Load Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,password);
			
			Statement stmt=con.createStatement();
//			stmt.execute("create table Bank(bankId int,Name varchar(20),Balence int)");
			
			int i=1;
			while(i==1) {
				System.out.println("Enter your choice \n1) Insertion \n2) Updation \n3) Delete \n4) FetchData");
				int choice=scan.nextInt();
				
				Bank bk=new Bank();
				
				
				switch(choice) {
				case 1:bk.insert(con);
						break;
				case 2:bk.update(con);
						break;
				case 3:bk.delete(con);
						break;
				case 4:bk.fetchData(con);
					break;
				default: System.out.println("Invalid Choice");
				}
				System.out.println("Do you want to contine press 1 otherwise press 0");
				i=scan.nextInt();
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
