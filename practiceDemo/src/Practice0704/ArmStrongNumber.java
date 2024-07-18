package Practice0704;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		
		System.out.println("ArmStrong numbers :");
		for (int num = 0; num <=number; num++) {
			int temp,sum=0,last = 0,digit=0;
			temp=num;
			while(temp>0) {
				temp=temp/10;
				digit++;
				
			}
			temp=num;
			
			while(temp>0) {
				last=temp%10;
				sum=(int) (sum+Math.pow(last, digit));
				temp/=10;
				
			}
			if(num==sum) {
				
				System.out.print(num+" is armstrong number ");
			}			
		}
	}

}
