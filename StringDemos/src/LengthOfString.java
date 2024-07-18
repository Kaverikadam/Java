import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Scanner object
		Scanner sc=new Scanner(System.in);
		
		//Asking user to enter Strings
		System.out.println("Enetr first string");
		String s1=sc.next();
		
		System.out.println("Enetr first string");
		String s2=sc.next();
		
		//with useg length method compairing length
		if(s1.length()==s2.length()) {
			//if condition is true than printing length are equal
			System.out.println("Lengths are equal");
		}
		//printing lengths are not equal
		else {
			System.out.println("Length is not equal");
		}
	}

}
