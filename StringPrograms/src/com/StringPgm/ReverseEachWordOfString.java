package com.StringPgm;

import java.util.Scanner;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str=sc.nextLine();
		
		String[] arr=str.split(" ");
		String revWord="";
		for (int i = 0; i < arr.length; i++) {
			String word=arr[i];
			String rev="";
			for (int j = word.length()-1; j>=0; j--) {
				rev=rev+word.charAt(j);
			}
			revWord=revWord+rev+" ";
		}
		System.out.println(revWord);
		

	}

}
