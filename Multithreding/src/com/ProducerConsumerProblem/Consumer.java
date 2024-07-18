package com.ProducerConsumerProblem;

public class Consumer implements Runnable{
	
	Factory f;
	Consumer(Factory f){
		this.f=f;
		
	}
	public void run() {
		
		try {
			while(true) {
				f.consume();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
