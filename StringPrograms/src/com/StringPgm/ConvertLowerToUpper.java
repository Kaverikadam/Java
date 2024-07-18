package com.StringPgm;

import java.util.Scanner;

public class ConvertLowerToUpper {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string one: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter string two : ");
		String str2=sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			//converting lower case to upper case
			if(ch1[i]>='a' && ch1[i]<='z') {
				ch1[i]=(char)((int)ch1[i]-32);
			}
			
		}
		String st1=new String(ch1);
		System.out.println(st1);
		
		for (int i = 0; i < ch1.length; i++) {
			
			//converting upper case to lower case
			if(ch2[i]>='A' && ch2[i]<='Z') {
				ch2[i]=(char)((int)ch2[i]+32);
			}
		}
		String st2=new String(ch2);
		System.out.println(st2);
	}

}
