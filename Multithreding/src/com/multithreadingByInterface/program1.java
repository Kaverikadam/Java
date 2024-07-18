package com.multithreadingByInterface;

import java.util.Scanner;

public class program1 extends Thread{
	public void run() {
		if(Thread.currentThread().equals("Num")) {
			numPrint();
		}
		else {
			add();
		}
		
	}
	public void numPrint() {
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	static void add() {
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
