package com.StringPgm;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.next();
		
		System.out.println("");
		
		char[] ch1=str.toCharArray();
		char[] ch2=new char[ch1.length];
		int index=0;
		for (int i = 0; i < ch2.length; i++) {
			boolean status=false;
			
			for (int j = 0; j < ch2.length; j++) {
				if(ch1[i]==ch2[j]) {
					status=true;
					break;
				}
				if(!status) {
					ch2[index]=ch1[i];
					index++;
				}
			}
		}
		String str2=new String(ch2);
		System.out.println(str2);
	
		
		/*
		String st="";
		for (int i = 0; i < str.length(); i++) {
			if(!st.contains(str.charAt(i)+" ")) {
				st=st+str.charAt(i);
			}
		}
		System.out.println(st);
		*/
		
		
	}

}
 