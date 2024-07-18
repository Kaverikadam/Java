package com.Practice27Apr;

import java.util.Scanner;

public class ArmStrong {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int digit=0, sum=0, last=0,temp=0;
		
		temp=num;
		while(temp>0) {
			temp/=10;
			digit++;
		}
		
		temp=num;
		while(temp>0) {
			last=temp%10;
			sum=(int)(sum+Math.pow(last, digit));
			temp/=10;
		}
		
		if(sum==num) {
			System.out.println(num+" is a armstrong number ");
		}
		else {
			System.out.println(num+" is not a armstrong number ");
		}
	}

}
