package Practice0704;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		primeNumbers(num);
		primeOrNot(num);
		
	}
	static void primeNumbers(int num) {
		System.out.println("Prime numbers : \n");
		int sum=0,rem=0,count=0;
		
		for(int i=1;i<=num;i++) {
			count=0;
			for(int j=1;j<=num;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	static void primeOrNot(int num) {
		
		int sum=0,rem=0,count=0;
		
		for(int i=1;i<=num;i++) {
			count=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
				
			}
		}
		if(count==2) {
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		
	}

}
