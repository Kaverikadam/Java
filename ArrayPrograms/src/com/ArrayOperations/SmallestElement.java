package com.ArrayOperations;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length : ");
		//creating array with size of user input
		int[] arr=new int[sc.nextInt()];
		
		//reading user input  and storing it array
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//creating variable
		int smallest=arr[0];
		//Finding smallest element in array
		for(int i=0;i<arr.length;i++) {
		
			//cheking condition which element is smallest
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		//Printing smallest elemet
		System.out.println("Smallest element of array : "+smallest);

	}

}
