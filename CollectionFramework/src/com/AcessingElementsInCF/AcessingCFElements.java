package com.AcessingElementsInCF;

import java.util.*;

public class AcessingCFElements {
	public static void main(String[] args) {
		usingForLoop();
		usingForEachLoop();
		usingIterator();
		usingListIterator();
		usingDecsendingIterator();
	}
	static void usingForLoop() {
		ArrayList ad=new ArrayList();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		for(int i=0;i<ad.size();i++) {
			System.out.print(ad.get(i)+" ");
		}
	}
	static void usingForEachLoop() {
		System.out.println();
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		for(Object x:ad) {
			System.out.print(x+" ");
		}
	}
	static void usingIterator() {
		System.out.println();
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		Iterator itr=ad.iterator();
		
		while(itr.hasNext()==true) {
			System.out.print(itr.next()+" ");
		}
	}
	static void usingListIterator() {
		System.out.println();
		LinkedList ad=new LinkedList();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		ListIterator litr= ad.listIterator();
		
		while(litr.hasNext()==true) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		while(litr.hasPrevious()==true) {
			System.out.print(litr.previous()+" ");
		}
		
		
	}
	
	static void usingDecsendingIterator() {
		System.out.println();
		LinkedList ad=new LinkedList();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		Iterator litr= ad.descendingIterator();
		
		while(litr.hasNext()==true) {
			System.out.print(litr.next()+" ");
		}
		
	}
	

}



























