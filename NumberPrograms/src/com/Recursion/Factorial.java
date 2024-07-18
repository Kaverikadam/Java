package com.Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//logic of factorial
		/*
		 1. read a number 
		 2.call the method
		 3.if number is <= 0 return1
		 4.else return n*factorial (n-1)
		  */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int fact=factorial(num);
		System.out.println("Factorial of "+num+" : "+fact);
		
	}
	static int  factorial(int num) {
		
		if(num<=0) {
			return 1;			
		}
		else {
			return num * factorial(num-1);
		}
	}

}
