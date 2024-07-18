import java.util.Scanner;

public class ConcateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//Cheching both values are equal or not
		System.out.println();
		if(s1.equals(s2)) {
			//if both are equal then printing both values
			System.out.println(s1.concat(s2));
		}

	}

}
