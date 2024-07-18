package com.ArrayOperations;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// reading user input
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter a length of array : ");
		//creating array with user enterd length
		int[] arr=new int[sc.nextInt()];
		//creating new array with same size of arr
		int[] revArr=new int[arr.length];
		
		//reding array elements and storing it back to array using for loop
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//printing original array using for loop
		System.out.print("Original array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//code of reversing array with the help of j variable
		int j=revArr.length-1;
		for (int i = 0; i < arr.length; i++) {
			revArr[i]=arr[j];
			j--;
		}
		//printing reversed array
		System.out.print("Reversed Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(revArr[i]+" ");
		}
	}

}
