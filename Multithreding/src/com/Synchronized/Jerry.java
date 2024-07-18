package com.Synchronized;

public class Jerry implements Runnable{

	Treatment t;
	public Jerry(Treatment t ){
		this.t=t;
	}

	public void run() {
		t.jerryTreatment();
		
	}

}
