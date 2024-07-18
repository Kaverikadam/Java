package com.ArrayOperations;

import java.util.Scanner;

public class ArrayMerging {
	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//reading user input as length of array 
		System.out.println("Enter array 1 length : ");
		int[] arr1=new int[sc.nextInt()];
		
		//reading array elements and storing it in to array
		System.out.println("Enter array 1 elements : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter array 2 length : ");
		int[] arr2=new int[sc.nextInt()];
		
		//reading array elements and storing it in to array
		System.out.println("Enter array 2 elements : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		//creating array
		int[] arr3=new int[arr1.length+arr2.length];
		
		//Mearging logic 
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		//Display merged array
		System.out.println("Mearged Array : ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
	
