package com.StringPractice;

import java.util.Scanner;

public class RevStringUsingVar {
	
	//Reversing the string using variables
	
	public static void main(String[] args) {
		// Reading user input
		Scanner sc=new Scanner(System.in);
		//asking user to enter a string
		System.out.println("Enetr a string :");
		//reading user input and store it in str var
		String str=sc.nextLine();
		
		//using empty rev var
		String rev="";
		//using loop to traverse string in reverse form
		for(int i=str.length()-1;i>=0;i--) {
			
			//concating empty string to each char of str var using charAt() method
			rev=rev+str.charAt(i);
		}
		//displying result of reverse string
		System.out.println("Reverse str :" + rev);
	}

}
