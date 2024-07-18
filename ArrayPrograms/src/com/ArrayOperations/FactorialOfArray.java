package com.ArrayOperations;

import java.util.Scanner;

public class FactorialOfArray {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		//creating array with length of user input
		System.out.println("Enter a length : ");
		int[] arr=new int[sc.nextInt()];
		
		//reading array elements and storing it in to array
		System.out.println("Enter array element : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//calling method and printing factorial number
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Factorial of "+arr[i]+" : "+isFactorial(arr[i]));
		}
		
	}
	//creating integer type method
	static int isFactorial(int num) {
		//creating fact variable
		int fact=1;
		//using for loop
		for(int i=num;i>=1;i--) {
			//calculating factorial
			fact=fact*i;
		}
		//returning factorial
		return fact;
	}

}
