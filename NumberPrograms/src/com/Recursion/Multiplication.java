package com.Recursion;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr a number : ");
		int num=sc.nextInt();
		
		multiply(num,1);

	}
	static void multiply(int num,int i) {
		if(i>10) {
			return;
		}
		else {
			System.out.println(num +" * "+ i+" = "+num * i);
			multiply(num, i+1);
		}
	}

}
