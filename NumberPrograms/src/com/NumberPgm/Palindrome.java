package com.NumberPgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num =sc.nextInt();
		
		isPalindrome(num);
	}
	static void isPalindrome(int num) {
		int rem=0,sum=0,n=num;
		while(num>=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(n==sum) {
			System.out.println(n +" Number is palindrome");
		}
		else {
			System.out.println(n +" Number is not a palindrome");
		}
	}
}
