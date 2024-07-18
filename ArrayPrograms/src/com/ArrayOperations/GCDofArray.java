package com.ArrayOperations;

import java.util.Scanner;

public class GCDofArray {

	public static void main(String[] args) {
		// Creating Scanner object
		Scanner sc=new Scanner(System.in);
		
		//creating array with size of user input
		System.out.print("Enter a length of array : ");
		int[] arr=new int[sc.nextInt()];
		
		//reading array elements and storing it in to array
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" ");
		//Calling method gcdOfArray and printing gcd of their values
		for (int i = 0; i < arr.length; i++) {
			System.out.println("GCD of "+arr[i]+" "+arr[i+1]+" is "+gcdOfArray(arr[i],arr[i+1]));
		}
		
	}
	//creating method gcdOfArray 
	static int gcdOfArray(int num,int num1) {
		//creating variable gcd
		int gcd=1;
		//using for loop
		for(int i=1;i<= num;i++) {
			//calculating gcd 
			if(num%i==0 && num1%i==0) {
				gcd=i;
			}
		}
		//returning gcd value
		return gcd;
			
	}

}
