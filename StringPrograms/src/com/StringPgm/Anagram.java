package com.StringPgm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
//Anagram is performing operations on string where after sorting the string both strings are same 
	public static void main(String[] args) {
		// creating scanner object
		
		Scanner sc=new Scanner(System.in);
		//reading a uer value as a string and storing it back to variavle type string
		System.out.println("Enter First String : ");
		String str1=sc.nextLine();
		
		System.out.println("Enter second String : ");
		String str2=sc.nextLine();
		
		//creating char type array to sort the charecters
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		//sorting char using inbuild methods
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String sort1=new String(ch1);
		String sort2=new String(ch2);
		//comparing the strings 
		if(sort1.equals(sort2)) {
			System.out.println(str1+" and "+str2 +" are anagram");
		}
		else {
			System.out.println(str1+" and "+str2 +" are not anagram");
		}
		

	}

}
