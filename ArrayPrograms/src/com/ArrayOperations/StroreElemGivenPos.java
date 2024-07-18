package com.ArrayOperations;

import java.util.Scanner;

public class StroreElemGivenPos {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		//reading user input and store it in variable
		System.out.println("Enter array length : ");
		int[] arr=new int[sc.nextInt()];
		//asking user to enter array position where he want to store 
		
		System.out.println("Enter array position 0 to "+(arr.length-1)+" : ");
		int pos=sc.nextInt();
		
		///checking enterd pos is valid or not
		System.out.println("Enter array element : ");
		if(pos>=0 && pos<=arr.length-1) {
			arr[pos]=sc.nextInt();
		}
		else {
			System.out.println("You enterd invalid position ");
		}
		
		//displying enterd elements is
		System.out.println("Enterd element is : "+arr[pos]);
		

	}

}
