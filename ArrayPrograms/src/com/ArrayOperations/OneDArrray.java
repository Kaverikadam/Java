package com.ArrayOperations;

import java.util.Scanner;

public class OneDArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  array length : ");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array length : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
