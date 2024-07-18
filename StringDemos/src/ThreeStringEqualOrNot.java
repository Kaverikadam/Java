import java.util.Scanner;

public class ThreeStringEqualOrNot {

	public static void main(String[] args) {
		//create Scanner object
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter a string
		System.out.println("Enetr first string :");
		
		//reading user input and storing it in to s1 variable
		String s1=sc.next();
		
		//asking user to enter a string
		System.out.println("Enetr first string");
		
		//reading user input and storing it in to s2 variable
		String s2=sc.next();
		
		//asking user to enter a string
		System.out.println("Enetr first string");
		
		//reading user input and storing it in to s2 variable
		String s3=sc.next();
		
		
		//Cheching both values are equal or not
		System.out.println();
		if(!s1.equals(s2) && !s2.equals(s3)) {
			
			//condition false printing String values
			System.out.println(s1+","+s2+","+s3);
			
		}
		else {
			//if both are equal then printing  
			System.out.println("values are equal");
		}

	}

}
