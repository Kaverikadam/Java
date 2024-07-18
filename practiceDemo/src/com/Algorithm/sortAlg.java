package com.Algorithm;

import java.util.Scanner;

public class sortAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort();
		
		}
		

	
	static void insertionSort() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 1; i < arr.length; i++) {
			int elem=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>elem) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=elem;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
