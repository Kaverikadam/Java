package com.Algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array ");
		int[] arr=new int[sc.nextInt()];
		
		//Reading array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter key value : ");
		int key=sc.nextInt();
		
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println(arr[mid]+" Key found at index "+mid);
				return;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else if(key > arr[mid]) {
				low=mid+1;
			}
		}
		System.out.println(key+" Key not found ");

	}

}
