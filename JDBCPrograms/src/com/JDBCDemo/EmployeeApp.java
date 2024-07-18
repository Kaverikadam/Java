package com.JDBCDemo;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.*;

public class EmployeeApp {

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
			
//			Statement stmt=con.createStatement();
//			stmt.execute("create table Employee(empId int, empName varchar(20),empSalary int)");
			
			int i=1;
			while(i==1) {
				System.out.println("Enter your choice \n1) Insertion \n2) Updation \n3) Delete \n4) FetchData");
				int choice=scan.nextInt();
				
				Employee emp=new Employee();
				
				
				switch(choice) {
				case 1:emp.insert(con);
						break;
				case 2:emp.update(con);
						break;
				case 3:emp.delete(con);
						break;
				case 4:emp.fetchData(con);
					break;
				default: System.out.println("Invalid Choice");
				}
				System.out.println("Do you want to contine press 1 otherwise press 0");
				i=scan.nextInt();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
