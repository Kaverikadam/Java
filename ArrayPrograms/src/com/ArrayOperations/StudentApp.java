package com.ArrayOperations;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// Non-Primitive Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of students :");
		Student[] std=new Student[sc.nextInt()];
		
		System.out.println("Enter Name, STDID, Marks, Phone No");
		for(int i=0;i<std.length;i++) {
			std[i]=new Student(sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextLong());
		}
		
		System.out.println("Student Details : ");
		for(int i=0;i<std.length;i++) {
			System.out.println(" Name : "+std[i].name
					+"\n Student ID : "+std[i].stdID
					+"\n Marks : "+std[i].marks
					+"\n Phone number : "+std[i].phNo);
		}
	}

}
