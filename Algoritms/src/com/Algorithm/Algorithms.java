package com.Algorithm;

import java.util.Scanner;

public class Algorithms {

	public static void main(String[] args) {
		// Algorithm programs 
		Scanner sc=new Scanner(System.in);
		
		
		int choice=1;
		while(choice==1) {
			System.out.println("Choose your choice :");
			
			System.out.println("1). Linear Search "
					+ "\n2). Binary Search "
					+"\n3). Bubble Sort "
					+"\n4). Selection Sort"
					+"\n5). Insertion Sort");
			
			int ch = sc.nextInt();
			switch(ch) {
				case 1: linearSearch(); 
				break;
					
				case 2: binarySearch();
				break;
				
				case 3: bubbleSort();
				break;
				
				case 4: selectionSort();
				break;
				
				case 5: insertionSort();
				break;
				
				default: System.out.println("Invalid choice");
			
			
			}
			System.out.println();
			System.out.println("Do you want to continue press 1 otherwise press 0");
			choice =sc.nextInt();
			
		}
		System.out.println("Thank you...");
		

	}
	
	static void linearSearch() {
		System.out.println("Linear Search ");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a key ");
		int key=sc.nextInt();
		
		System.out.println();
		
		System.out.print("Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		int k=0,index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				k=arr[i];
				index=i;
			}
		}
		if(key==k) {
			System.out.println("Key "+key+" found at index "+index);
		}
		else {
			System.out.println("Key not found ");
		}
	}
	static void binarySearch() {
		
		System.out.println("Binary Search ");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a key ");
		int key=sc.nextInt();
		
		System.out.println();
		
		System.out.print("Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]==key) {
				System.out.println("Key "+key+" is found ");
				return;
			}
			else if(key < arr[mid]) {
				high=mid;
			}
			else if(key > arr[mid]) {
				low=mid;
			}
			System.out.println("Key "+key+" not found ");
			return;
		}
		
	}
	static void bubbleSort() {
		System.out.println("Bubble Sort ");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void selectionSort() {
		System.out.println("Selection Sort");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			int min=arr[i];
			int pos=i;
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
		System.out.print("Sorted Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	static void insertionSort() {
		System.out.println("Insertion Sort ");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for (int i = 1; i < arr.length; i++) {
			int elem=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>elem) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j]=elem;
		}
		System.out.print("Sorted Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}