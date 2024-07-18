package com.ArrayOperations;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(isArrayPalindrome(arr[i])) {
				System.out.println(arr[i]+" is palindrome");
			}
		}

	}
	static boolean isArrayPalindrome(int num) {
		
		int rem=0,sum=0,n=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		return sum==n;
		
	}

}
