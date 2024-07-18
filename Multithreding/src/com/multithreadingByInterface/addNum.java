package com.multithreadingByInterface;

import java.util.Scanner;

public class addNum implements Runnable{

	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number :");
		int a=sc.nextInt();
		
		System.out.println("Enter a second number : ");
		int b=sc.nextInt();
		try {
			Thread.sleep(3000);
			System.out.println(a+b);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
