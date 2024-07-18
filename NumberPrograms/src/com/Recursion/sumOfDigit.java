package com.Recursion;

import java.util.Scanner;

public class sumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int count=countNum(num);
		System.out.println("Sum of given digit is "+count);
	}
	static int countNum(int num) {
		int rem=0,sum=0;
		if(num==0) {
			return 0;
		}
		else {
			
			return num%10 +countNum(num/10);
			
		}
	}

}
