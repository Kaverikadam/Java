package com.multithreadingByInterface;

public class MultithreadingUsingInterface {

	public static void main(String[] args) {
		numberPrint np=new numberPrint();
		addNum ad=new addNum();
		
		Thread t1=new Thread(np);
		Thread t2=new Thread(ad);
		t1.start();
		t2.start();
	}

}
