package com.JDBCDemo;



//Importing java.sql packege
import java.sql.*;


public class CreatingTableUsingJDBC {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/javadb";
		String user="root";
		String password="root123";
		
		String query="create table Student(rollNo int, Name varchar(20),age int)";
		
		String insertQuery1="insert into Student values(1,'Kaveri',23)";
		String insertQuery2="insert into Student values(2,'Kiran',26)";
		String insertQuery3="insert into Student values(3,'Pratik',23)";
		String insertQuery4="insert into Student values(4,'Rohan',22)";
		String insertQuery5="insert into Student values(5,'Sham',25)";
		
		String deleteQuery="delete from Student";
		
		String updateQuery="Update Student set Name='Sneha' where rollNo=5";
		
		String selectQuery="select * from Student";
		try {
			//Loading the driver -> im mysql we can skip the loading driver 
			
			//Establishing the connection
			
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection established");
			
			//Creating statement using connection
			Statement stmt=con.createStatement();
			
			//Executingg the query
			
//			stmt.execute(query);
//			stmt.execute(insertQuery1);
//			stmt.execute(insertQuery2);
//			stmt.execute(insertQuery3);
//			stmt.execute(insertQuery4);
//			stmt.execute(insertQuery5);
//			
//
//			stmt.execute(deleteQuery);
			
//			stmt.executeUpdate(updateQuery);
			
			ResultSet rs=stmt.executeQuery(selectQuery);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			System.out.println("Query is executed");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
