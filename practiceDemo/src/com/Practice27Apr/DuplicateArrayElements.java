package com.Practice27Apr;

import java.util.Scanner;

public class DuplicateArrayElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of an array");
		int[] arr=new int[sc.nextInt()];
		int[] dup=new int[arr.length];
				
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Duplicate array elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < dup.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
