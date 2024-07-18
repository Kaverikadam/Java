package com.ArrayOperations;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of blocks : ");
		int[][][] arr=new int[sc.nextInt()][][];
		
		System.out.println("Enter array rows : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[sc.nextInt()][];
		}
		System.out.println("Enter array columns : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=new int[sc.nextInt()];
			}
		}
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					arr[i][j][j2]=sc.nextInt();
				}
			}
		}
		
		System.out.println("Array elements are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					System.out.print(arr[i][j][j2]+" ");
				}System.out.println();
			}System.out.println();
		}

	}

}
