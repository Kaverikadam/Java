package com.NumberPgm;
import java.util.Scanner;

public class ArmStrongProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int digit=0,sum=0,temp,last;
		temp=num;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;
			sum=(int) (sum+(Math.pow(last, digit)));
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println(num+" Is armStrong num");
		}
		else {
			System.out.println(num+"  is not arm strong num");
		}

	}

}
