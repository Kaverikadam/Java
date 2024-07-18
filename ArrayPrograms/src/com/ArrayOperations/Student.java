package com.ArrayOperations;

public class Student {

	
	String name;
	int stdID;
	float marks;
	long phNo;
	void displayData() {
		System.out.println("Name : "+name);
		System.out.println("Student ID : "+stdID);
		System.out.println("Marks : "+marks);
		System.out.println("Phone No : : "+phNo);
	}
	public Student(String name, int stdID, float marks, long phNo) {
		super();
		this.name = name;
		this.stdID = stdID;
		this.marks = marks;
		this.phNo = phNo;
	}
	
	
}
