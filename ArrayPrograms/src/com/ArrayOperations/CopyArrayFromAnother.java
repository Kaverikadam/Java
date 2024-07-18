package com.ArrayOperations;

import java.util.Scanner;

public class CopyArrayFromAnother {

	public static void main(String[] args) {
		// reading user input
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter a length of array : ");
		//creating array with user enterd length
		int[] arr=new int[sc.nextInt()];
		//creating new array with same size of arr
		int[] newArr=new int[arr.length];
		
		//reding array elements and storing it back to array using for loop
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		///printing original array using for loop
		System.out.print("Original array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//coping array elements in newArr array
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[i];			
		}
		//displying the duplicate array
		System.out.print("Duplicate array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
	}

}
