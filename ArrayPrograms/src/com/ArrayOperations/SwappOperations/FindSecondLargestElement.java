package com.ArrayOperations.SwappOperations;

import java.util.Scanner;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a array size : ");
		int[] arr=new int[sc.nextInt()];
//		int[] rev=new int[arr.length];
		
		System.out.println("Enter array elements :" );
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array Second Largest Array Element is : "+arr[1]);
	}

}
