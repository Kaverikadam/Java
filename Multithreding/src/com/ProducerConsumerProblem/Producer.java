package com.ProducerConsumerProblem;

public class Producer implements Runnable{
	
	Factory f;
	Producer(Factory f){
		this.f=f;
		
	}
	public void run() {			
		try {
			int n=1;
			while(true) {
				f.produce(n++);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}


}
