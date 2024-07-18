package com.ArrayPrograms;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,50,30};
		
		
		int rem=0,sum=0;
		for (int i = 0; i < arr.length; i++) {
			int elem=arr[i];
			while(elem>0) {
				rem=elem%10;
				sum=sum+rem;
				elem/=10;
			}
		}
		System.out.println(sum);
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			s+=arr[i];
		}
		System.out.println(s);

	}

}
