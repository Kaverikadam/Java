package com.StringPgm;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		//using string array
		String[] st=str.split(" ");
		String str2="";
		for (int i = 0; i < st.length; i++) {
			str2=str2+st[i]+"";
		}
		System.out.println(str2);
		
		
		//by converting in to char array
		char[] ch=str.toCharArray();
		String str3="";
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ') {
				i++;
			}
			str3=str3+ch[i];
		}
		System.out.println(str3);

	}

}
