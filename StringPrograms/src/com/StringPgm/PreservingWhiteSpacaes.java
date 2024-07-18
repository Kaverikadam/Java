package com.StringPgm;

import java.util.Scanner;

public class PreservingWhiteSpacaes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1=sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=new char[ch1.length];
		
		int j=ch1.length-1;
		
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i]==' ') {
				ch2[i]=' ';
				
			}
			else if(ch1[i]!=' ') {
				if(ch2[j]==' ') {
					
					j--;
				}
				ch2[j]=ch1[i];
				j--;
			}
			
		}
		String str=new String(ch2);
		System.out.println(str);
		
		//Number of occures a charecter
		
		String s = "Java is java again java again";
		 
        char c = 'a';
 
        int count = s.length() - s.replace("a", "").length();
 
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	}

}
