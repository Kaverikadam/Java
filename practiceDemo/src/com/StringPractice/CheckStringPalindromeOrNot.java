package com.StringPractice;

import java.util.Scanner;

public class CheckStringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a string :");
		String str=sc.nextLine();
		String rev="";
		
		if(usingVar(str, rev)) {
			System.out.println(str+" is palindrome");
		}
		if(usingArr(str)) {
			System.out.println(str+" is palindrome");
		}	
		
	}
	
	static boolean usingVar(String str,String rev) {
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev.equals(str);
	}
	
	
	static boolean usingArr(String str) {
		
		char[] arr=str.toCharArray();
		char[] newArr=new char[arr.length];
		int j=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[j];
			j--;
		}
		String str1=new String(newArr);
		
		return str1.equals(str);
	}
	

}
