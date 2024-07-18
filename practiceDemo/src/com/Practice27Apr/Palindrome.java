package com.Practice27Apr;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int sum=0,rem=0,n=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		if(sum==n) {
			System.out.println(sum+" is a palindrome ");
		}
		else {
			System.out.println(sum+" is not a palindrome");
		}
	}

}
