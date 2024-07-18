package Practice0704;

import java.util.Scanner;

public class FibonacciNumbers {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int fib=0,n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<num;i++) {
			fib=n1+n2;
			System.out.print(fib+" ");
			n1=n2;
			n2=fib;
		}
		
	}

}
