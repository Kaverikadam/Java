package com.Practice27Apr;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,5,3,8,9};
		int target=8;
		int[] idx=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					idx[0]=i;
					idx[1]=j;	
				}
			}
			
		}
		for(int i=0;i<idx.length;i++) {
			System.out.print(idx[i]+" ");
		}
	}

}
