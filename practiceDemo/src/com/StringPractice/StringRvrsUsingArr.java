package com.StringPractice;

import java.util.Scanner;

public class StringRvrsUsingArr {

	//reversing string using vharecter type array
	public static void main(String[] args) {
		// creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter a string
		System.out.println("Enetr a string :");
		//reading user input and store it in str var
		String str=sc.nextLine();
		
		//converting string in to char type of array using toCharArray()
		char[] arr=str.toCharArray();
		//creating empty array to store reverse of array
		char[] revArr=new char[arr.length];
		//using j variable to traverse array in reverse format
		int j=arr.length-1;
		
		//using loop ti traverse array
		for (int i = 0; i < arr.length; i++) {
			//adding charecters in revArr[] last position of arr[]
			revArr[i]=arr[j];
			//decrementing j value
			j--;
		}
		//creating new string and converting rev array to string
		String str1=new String(revArr);
		//pring the result
		System.out.println("Reversse String is :"+str1);

	}

}
