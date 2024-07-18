package com.ArrayOperations;

import java.util.Scanner;

public class PrintingBorderElementsClockwiseDir {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		//reading lengthof array
		System.out.println("Enter a length of array : ");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
				
		//reading array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elemets : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//Printing Border elements
		System.out.println("Border elements clock wise direction");
		//Printing first row
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[0][i]+" ");
		}
		
		//Printing last column except first row
		for (int i = 1; i < n; i++) {
			System.out.print(arr[i][n-1]+" ");
		}
		//Printing last row except last column
		
		for(int i=arr.length-2;i>=0;i--) {
			System.out.print(arr[n-1][i]+" ");
		}
		//Printing first column except last row
		for(int i=arr.length-2;i>=1;i--) {
			System.out.print(arr[i][0]+" ");
		}
		
		

	}

}
