package com.Recursion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci series
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		System.out.println("Facorial of series");
		for(int i=0;i<=num;i++) {
			System.out.print(isFibonacci(i)+" ");
		}
	}
	static int isFibonacci(int num) {
		if(num<=1) {
			return num;
		}
		else {
			return isFibonacci(num-1)+isFibonacci(num-2);
		}
	}

}
