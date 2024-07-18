package com.ArrayOperations;

import java.util.Scanner;

public class PrimeNumbersArray {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//creating array with size of user input
		System.out.println("Enter array length : ");
		int[] arr=new int[sc.nextInt()];
		
		//reading array elements and storing it in to array
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
					
		}
		//displying array elements
		System.out.println("Array elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		//calling isPrime numbers
		for(int i=0;i<arr.length;i++) {
			isPrime(arr[i]);
		}
	}
	//isPrime Method is created
	static void isPrime(int num){
		//creating variable count 
		int count=0;
		//using for loops to calculate prime or not
		for(int i=0;i<= num;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(num%j==0) {
					count++;
				}
			}
		}
		//checking condition is count values is 2 than its prime
		if(count==2) {
			System.out.println(num+" is Prime numbers");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
}
