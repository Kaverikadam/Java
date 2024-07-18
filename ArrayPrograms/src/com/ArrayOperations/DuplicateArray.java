package com.ArrayOperations;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		int[] arr1=new int[arr.length];
		
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
				
			}
		}
		
	}

}
