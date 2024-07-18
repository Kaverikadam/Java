package practiceDemo;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr a string ");
		String str=sc.next();
		
		comparisionOps();
		unicodeDemo();

	}
	static void comparisionOps() {
		String str1="Java";
		String str2="Java";
		
		if(str1==str2) {
			System.out.println("References are same");
		}
		else {
			System.out.println("References are not same");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}
		
		if(str1.compareTo(str2)>0) {
			System.out.println("First string is greater");
		}
		else if(str1.compareTo(str2)<0) {
			System.out.println("Second String is greater");			
		}
		else {
			System.out.println("Both are same");
		}
	}
	
	static void unicodeDemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number which you want its unicode");
		int num=sc.nextInt();
		
		char ch=(char)num;
		
		System.out.println("Charecter of given number is :"+ch);
		
		System.out.println("Enetr a charecter which unicode you want :");
		
		char ch1=sc.next().charAt(0);	
		
		int n=(int)ch1;
		
		System.out.println("Unicode of charecter "+n);
		
	}

}




















