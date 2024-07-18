package com.StringPgm;

import java.util.Scanner;
//swapping first half charecter to last and last to first

public class StringSwapp {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String str=sc.next();
		
		char[] arr=str.toCharArray();
		char[] newArr=new char[arr.length];
		
		
		for (int i = 0; i < arr.length/2; i++) {
			char temp=arr[i];
			arr[i]=arr[(arr.length/2)+i];
			arr[(arr.length/2)+i]= temp;
		}
		
		System.out.println("Swapped String : ");
		String str1=new String(arr);
		System.out.println(str1);

	}

}
