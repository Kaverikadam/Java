package com.StringPgm;

import java.util.Scanner;

public class PrintAllPossibleSubStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		System.out.println("Enter length of subString : ");
		int length=sc.nextInt();
		
		if(length <= 0 || length > str.length()) {
			System.out.println("Invalid length you have enterd");
			return;
		}
		for (int i = 0; i < str.length()-length; i++) {
			String subStr=str.substring(i, i+length);
			System.out.println(subStr);
			
		}

	}

}
