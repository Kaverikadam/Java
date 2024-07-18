package com.kodnest.collectionFramework.arrayListPro;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(70);
		al.add(60);
		System.out.println(al);
		al.add("ajay");
		al.set(1,99);
		System.out.println(al);
		al.addAll(al);
		System.out.println(al);
	}
}
