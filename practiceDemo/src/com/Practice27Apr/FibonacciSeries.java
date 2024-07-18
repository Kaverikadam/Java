package com.Practice27Apr;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int n1=0,n2=1,fib;
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=num;i++) {
			fib=n1+n2;
			System.out.print(fib+" ");
			n1=n2;
			n2=fib;
		}
	}

}
