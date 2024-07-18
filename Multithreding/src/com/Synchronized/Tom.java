package com.Synchronized;

public class Tom implements Runnable
{
	Treatment t;
	public Tom(Treatment t ){
		this.t=t;
	}

	public void run() {
		t.tomTreatment();
		
	}

}
