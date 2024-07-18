package com.kodnest.collectionFramework.ArrayDequePro;

import java.util.ArrayDeque;

public class ArrayDequePgm {
	public static void main(String[] args) {
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20.5);
		ad.add("Java");
		ad.add('k');
		ad.add(true);
		
		System.out.println(ad);
	}
}
