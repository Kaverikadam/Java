package com.multithreadingByInterface;

public class ThredingUsingSinleRunMethod {
	public static void main(String[] args) {
		program1 t1=new program1();
		t1.setName("Num");
		t1.start();
		
		program1 t2=new program1();
		t2.setName("add");
		t2.start();
		
	}
}
