package com.Algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array ");
		int[] arr=new int[sc.nextInt()];
		
		//Reading array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//Performing 
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
