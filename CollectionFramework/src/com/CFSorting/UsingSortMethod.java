package com.CFSorting;

import java.util.*;

public class UsingSortMethod {
	public static void main(String[] args) {
		arrayListDemo();
		linkedDemo();
		arrayDequeDemo();
		treeSetDemo();
	}
	static void arrayListDemo() {
		System.out.println("ArrayList");
		ArrayList al=new ArrayList();
		al.add(70);
		al.add(58);
		al.add(30);
		al.add(90);
		al.add(10);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
	static void linkedDemo() {
		System.out.println("Linked List");
		LinkedList al=new LinkedList();
		al.add(70);
		al.add(58);
		al.add(30);
		al.add(90);
		al.add(10);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
	static void arrayDequeDemo() {
		System.out.println("ArrayDeque");
		ArrayDeque al=new ArrayDeque();
		al.add(70);
		al.add(58);
		al.add(30);
		al.add(90);
		al.add(10);
		System.out.println(al);
		
		ArrayList alst=new ArrayList();
		alst.addAll(al);
		
		Collections.sort(alst);
		
		al.clear();
		al.addAll(alst);
		System.out.println(al);
	
		
	}
	static void treeSetDemo() {
		System.out.println("TreeSet");
		TreeSet al=new TreeSet();
		al.add(70);
		al.add(58);
		al.add(30);
		al.add(90);
		al.add(10);
		System.out.println(al);
		
		
	}
}


































