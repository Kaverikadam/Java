package com.Algorithm;

import java.util.Scanner;

public class PracticeDemoAlgorithm {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a length of array : ");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter a array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		bubbleSort(arr);

	}
	static void bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted elements :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	static void insertionSort(int[] arr) {
		
	}

}
