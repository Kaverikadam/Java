package com.ProducerConsumerProblem;


//Problem of producer consumer problem
/*
public class Factory {
	int x;
	boolean status =false;
	 void produce(int n) {
		try {
			x=n;
				
			System.out.println("Producer is produvcing "+x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	 void consume() {
		try {
			
				System.out.println("Consumer is consuming "+x);
				
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

 */



//Solution for producer consumer problem
public class Factory {
	int x;
	boolean status =false;
	synchronized void produce(int n) {
		try {
			if(status==false) {
				x=n;
				status=true;
				System.out.println("Producer is produvcing "+x);
				notify();
			}
			else {
				wait();
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	synchronized void consume() {
		try {
			if(status==false) {
				wait();
			}
			else {
				System.out.println("Consumer is consuming "+x);
				status=false;
				notify();
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
