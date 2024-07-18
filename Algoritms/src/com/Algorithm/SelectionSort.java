package com.Algorithm;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length ");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array element : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int min=arr[i];
				int pos=i;
				
				if(arr[j]<min) {
					min = arr[j];
					pos=j;
				}
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
