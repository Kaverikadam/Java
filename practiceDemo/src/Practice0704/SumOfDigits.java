package Practice0704;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int rem=0,sum=0,i=0;;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
			i++;
		}
		System.out.println("Digits of given number : "+i);

	}

}
