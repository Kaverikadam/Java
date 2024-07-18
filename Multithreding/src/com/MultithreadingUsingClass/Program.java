package com.MultithreadingUsingClass;

public class Program {

	public static void main(String[] args) {
		
		Calculation c1=new Calculation();
		Calculation c2=new Calculation();
		Calculation c3=new Calculation();
		Calculation c4=new Calculation();
		
		c1.setName("add");
		c2.setName("sub");
		c3.setName("mul");
		c4.setName("div");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		
	}

}
