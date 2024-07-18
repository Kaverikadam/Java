package com.NumberPgm;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(i==1) {
			System.out.println("Enter your choice\n"
					+ "1) Prime number  series \n"
					+ "2) Check number is prime or not\n");
			
			int ch=sc.nextInt();
			System.out.println("enetr a number :");
			int n=sc.nextInt();
			
			switch(ch) {
			case 1: PrimeNumbers(n);break;
			case 2: checkPrimeOrNot(n);break;
			}
			System.out.println("\nDo you want to continue Press 1 else othe number ");
			i=sc.nextInt();
		}
		

	}
	static void PrimeNumbers(int n) {
		
		int count=0;		
		for(int i=1;i<=n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;						
				}					
			}
			if(count==2) {
				System.out.print(i+" ");
			}		
		}	
	}
	static void checkPrimeOrNot(int n) {
		int count=0;		
		for(int i=1;i<=n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;						
				}					
			}
		}		
		if(count==2) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}
	static void other(int n) {
		int count=0;
		//creating a loop which 
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(" Is Prime Number");
		}
		else System.out.println(" is Not Prime Number..");
		
	}

}
