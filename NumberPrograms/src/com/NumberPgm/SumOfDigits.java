package com.NumberPgm;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		numberCount(num);
		

	}
	static void numberCount(int num) {
		int rem=0,sum=0,n=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("Sum of numbers : "+sum);
	}

}
