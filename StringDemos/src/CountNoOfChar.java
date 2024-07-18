import java.util.Scanner;

public class CountNoOfChar {

	public static void main(String[] args) {
		// Creating Scanner object
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter a string
		System.out.println("Enter a string ");
		//reading user input
		String str=sc.next();
		//invoking countLength() and storing the result in count var
		int count=countLength(str);
		//print the length of string
		System.out.println("Number of charecter in string :"+count);
		
	}
	static int countLength(String str) {
		//converting the string to char type array 
		char[] arr=str.toCharArray();
		//creating count variable
		int count=0;
		
		//traversing array using loop
		
		for(int i=0;i<arr.length;i++) {
			//increasing count value
				count++;			
		}
		/*
		for(char ch : arr) {
			count++;
		}*/
		return count;

	}

}
