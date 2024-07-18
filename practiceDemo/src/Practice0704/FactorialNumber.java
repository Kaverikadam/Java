package Practice0704;

import java.util.Scanner;

public class FactorialNumber {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println((i+" -> "+fact));
		}
		
		
		System.out.println("Factrial of "+num+" is "+fact);
	}
	
}
