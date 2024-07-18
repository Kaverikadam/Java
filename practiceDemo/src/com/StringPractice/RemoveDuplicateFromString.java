package com.StringPractice;

import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		String newStr="";
	
		
		for (int i = 0; i < str.length(); i++) {
			if(! newStr.contains(str.charAt(i)+"")) {
				newStr+=str.charAt(i);
			}
		}
		System.out.println("Original String : "+str);
		System.out.println("Removed Dp;icates from string :"+newStr);
		duplicatesInArr(str);
		

	}
	static void duplicatesInArr(String str) {
		char[] arr=str.toCharArray();
		char[] newArr=new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(newArr[j]!=arr[i]) {
					newArr[i]=arr[i];
				}
			}
			String str2=new String(newArr);
			System.out.println(str2);
		}
	}

}
