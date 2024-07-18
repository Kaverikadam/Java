package com.Algorithm;

import java.util.Scanner;

public class LinearSearch {
	//Performing oeration on Linear search

	public static void main(String[] args) {
		// Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//Reading array length
		System.out.println("Enter length of array");
		int[] arr=new int[sc.nextInt()];
		
		//Reading array elements
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//reading key value
		System.out.println("Enter key values : ");
		int key =sc.nextInt();
		//searching key using for loop
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				System.out.println(arr[i]+" Key found at index "+i);
				return;
			}
		}
		//displying if key not found
		System.out.println(key+" Key not found ");
	
	}

}
