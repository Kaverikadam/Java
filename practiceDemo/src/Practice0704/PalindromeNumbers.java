package Practice0704;

import java.util.Scanner;

public class PalindromeNumbers {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int n=num,rem=0,sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		if(n==sum) {
			System.out.println(sum+" Is a palindrome");
		}
		else {
			System.out.println(sum+" is not a palindrome");
		}
		

	}

}
