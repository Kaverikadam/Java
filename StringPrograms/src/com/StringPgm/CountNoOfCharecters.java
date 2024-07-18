package com.StringPgm;

import java.util.Scanner;

public class CountNoOfCharecters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str1=sc.nextLine();
		int count=0;
		char[] ch1=str1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			count++;
		}
		System.out.println("Number of charecters using loop in string : "+count);
		
		System.out.println("Number of charecters using array length   : "+(ch1.length));
	}

}
