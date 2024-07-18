package com.Algorithm;

import java.util.Scanner;

public class Algorithm {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter array length : ");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//linearSearch(arr);
		//binarySearch(arr);
		//bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		

	}
	static void linearSearch(int[] arr) {
		System.out.println("Enter key value : ");
		int key=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				System.out.println(key+" Key found at index "+i);
				return;
			}
		}
		System.out.println(key +" key not found...");
		
	}
	static void binarySearch(int[] arr) {
		System.out.println("Enter a key value : ");
		int key=sc.nextInt();
		
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println(key+" Key found  ");
				return;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else if(key > arr[mid]) {
				low=mid+1;
			}
			
		}
		System.out.println(key+" Key is not found");
	}
	static void bubbleSort(int[] arr) {
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
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int pos=i;
			int min=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("Sorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int elem=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>elem) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j]=elem;
		}
		System.out.println("Sorted array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}






















