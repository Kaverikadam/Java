package com.Synchronized;

public class Hospital {
	public static void main(String[] args) {
		
		Treatment tr=new Treatment();
		
		Tom t=new Tom(tr);
		Jerry j=new Jerry(tr);
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(j);
		
	
		t1.start();
		t2.start();
		
	}

}
