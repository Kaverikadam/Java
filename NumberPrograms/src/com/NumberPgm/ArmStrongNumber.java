package com.NumberPgm;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// Writting code to check whether a enterd number is arm strong or not
		
		//Creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//Asking user to enter a number
		System.out.print("Enetr a number : ");
		//Resding user input and storing it in to variable
		int num =sc.nextInt();
		//Declaring variable whih helps to calculate arm strong number
		
		int rem=0,sum=0,n=num;
		//using while to iterate untill condition become false
		while(num>0) {
			//calculating reminder means last number
			rem=num%10;
			//calculating power of reminder
			sum=sum+(int)Math.pow(rem, 3);
			//removing last digit
			num/=10;
		}
		
		//checking condition whether enterd number and calculated no is same or not 
		if(n==sum) {
			System.out.println("Number is aram strong ");
		}
		else {
			System.out.println("Number is not arm strong");
		}
		
		

	}

}
