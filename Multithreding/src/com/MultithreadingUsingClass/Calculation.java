package com.MultithreadingUsingClass;

import java.util.Scanner;

public class Calculation extends Thread{
	 
	public void run() {
		if(getName().equals("add")) {
			add();
		}
		else if(getName().equals("sub")) {
			sub();
		}
		else if(getName().equals("mul")) {
			mul();
		}
		else{
			div();
		}
	}
	
	
	
	
	static void add() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter first no for addition : ");
			int a=sc.nextInt();
			System.out.println("Enter second no for addition : ");
			int b=sc.nextInt();
			
			int res=a-b;
			
			System.out.println("Adddition :"+res);
		
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void sub() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter first no for substraction : ");
			int a=sc.nextInt();
			System.out.println("Enter second no for substraction : ");
			int b=sc.nextInt();
			
			int res=a+b;
			
			System.out.println("substraction :"+res);
		
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static void mul() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter first no for multiplication : ");
			int a=sc.nextInt();
			System.out.println("Enter second no for multiplication : ");
			int b=sc.nextInt();
			
			int res=a*b;
			
			System.out.println("multiplication :"+res);
		
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static void div() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter first no for division : ");
			int a=sc.nextInt();
			System.out.println("Enter second no for division : ");
			int b=sc.nextInt();
			
			int res=a/b;
			
			System.out.println("division :"+res);
		
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
