package com.NumberPgm;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// Calculating prime numbers
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		//invoking a method with condition if it returns true then  the number is prime
		if(isPrime(num)) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}
		System.out.println();
		
		//invoking method 
		isPrimeNums(num);
	}
	
	
	//isPrime() method which checks enterd number is prime or not
	static boolean isPrime(int num) {
		//using count variable
		
		int count=0;
		//using for loop to iterate 0 to num value
		for(int i=1;i<=num;i++) {
			count=0;
			//j for loop to calculate which number is prime 
			for(int j=1;j<=i;j++) {
				if(num%j==0) {
					//if condition true than increamenting value 
					count++;
				}
			}
		}
		//if count ==2 than method returns true
		return count==2;
	}
	
	//isPrimeNums() method which prints prime numbers 
	static void isPrimeNums(int num) {
		System.out.println("Prime Numbers : ");
		
		
		int count=0;
		//using for loop to iterate 0 to num value
		for(int i=1;i<=num;i++) {
			count=0;
			//j for loop to calculate which number is prime 
			for(int j=1;j<=i;j++) {
				//if condition true than increamenting value 
				if(i%j==0) {
					count++;
					
				}
			}
			//if count value is 2 than it prints the i value
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}

























