package Practice0704.arrayPractice;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array length : ");
		
		int[] arr=new int [sc.nextInt()];
		int[] newArr=new int[arr.length];
		
		System.out.println("Enter array elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.print(arr[i]+" ");
//				}
//			}
//		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]!=arr[j]) {
					newArr[i]=arr[j];
				}
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
	}

}
