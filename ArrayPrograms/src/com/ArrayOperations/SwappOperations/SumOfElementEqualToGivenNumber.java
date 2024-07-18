package com.ArrayOperations.SwappOperations;

import java.util.Scanner;

public class SumOfElementEqualToGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size ");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :" );
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter a sum value");
		int sum=sc.nextInt();
		int i=0,j=arr.length-1;
		
		while(i<j) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" + "+arr[j]+" = "+(arr[i]+arr[j]));
			}
			i++;
			j--;
		}
	}

}
