package com.StringPgm;

import java.util.Scanner;

public class StringPalindrome {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String : ");
		String str=sc.next();
		
		char[] arr=str.toCharArray();
		char[] newArr=new char[arr.length];
		
		int j=arr.length-1;
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]=arr[j];
			j--;
		}
		String str1=new String(newArr);
		if(str.equals(str1)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
