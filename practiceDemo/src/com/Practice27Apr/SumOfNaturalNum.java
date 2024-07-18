package com.Practice27Apr;

import java.util.Scanner;

public class SumOfNaturalNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int sum=0,rem=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
			
		}
		System.out.println("Sum of natural no: "+sum);
	}
}
