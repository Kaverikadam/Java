package com.ArrayOperations;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  array row no : ");
		int[][] arr=new int[sc.nextInt()][];
		
		System.out.println("Enter array column no : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new int[sc.nextInt()];
		}
		
		System.out.println("Enter array elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
