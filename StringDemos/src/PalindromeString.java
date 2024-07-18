import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		//create Scanner object
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter a string
		System.out.println("Enetr first string :");
		
		//reading user input and storing it in to s1 variable
		String s1=sc.next();
		
		String rvs="";
		//reverse a string logic
		for(int i=s1.length()-1;i>=0;i--) {
			//stroring last charecter in ch variable 
			//charector value is assigning to string in rvs variable
			rvs=rvs+s1.charAt(i);			
		}
		//checking rvs string is equal or not
		if(s1.equals(rvs)) {
			System.out.println("String is palindrome ");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
