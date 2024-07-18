package com.JDBCDemo;

import java.sql.*;

public class Emp {
	int empId;
	String name;
	int age;
	
	public Emp(int empId , String name, int age){
		this.empId=empId;
		this .name=name;
		this.age=age;
	}
	void insert(Connection con) {
		
		try {
			String query="insert into employee values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, empId);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.execute();
			System.out.println("Insertion completed");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	void showData(Connection con) {
		System.out.println("-------------------------------------");

		System.out.println("Employee Data ");
		String query="select * from employee";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
