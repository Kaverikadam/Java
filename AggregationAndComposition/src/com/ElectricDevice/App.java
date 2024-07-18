package com.ElectricDevice;

public class App {

	public static void main(String[] args) {
		//Composition
		
//		Keyboard kb=new Keyboard("Prateek");
//		kb.typing();
		
		
		//Aggregation
		Laptop l=new Laptop("Kaveri");
		
		l.using();
		l.kb.typing();
			
	

	}

}
