package com.ElectricDevice;

public class Laptop {
	
	String user;
	
	
	//composition
//	Keyboard kb;
//	public Laptop(String user,Keyboard kb) {
//		this.user=user;
//		this.kb=kb;
//	}
//	
//	void using() {
//		System.out.println(user+" is using Laptop");
//	}

	//Aggregation
	
	Keyboard kb=new Keyboard("Kaveri");
	
	public Laptop(String user) {
		this.user=user;
	
	}
	
	void using() {
		System.out.println(user+" is using Laptop");
		kb.typing();
	
	}


}
