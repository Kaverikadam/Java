import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Scanner object
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter a string
		System.out.println("Enetr first string :");
		
		//reading user input and storing it in to s1 variable
		String s1=sc.next();
		char ch;
		String rvs="";
		//reverse a string logic
		for(int i=s1.length()-1;i>=0;i--) {
			//stroring last charecter in ch variable 
			//charector value is assigning to string in rvs variable
			rvs=rvs+s1.charAt(i);			
		}
		//Printing the reverse string
		System.out.println("Reverse String is : "+rvs);
	}

}
