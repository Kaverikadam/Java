import java.util.Scanner;

public class ConverLowerToUpper {

	public static void main(String[] args) {
		// Converting lower case charecters to upper case charecters
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter astring
		System.out.println("Enter a string ");
		//reading user input and storing it to string type of variable
		String str=sc.next();
		
		converUpper( str);
	}
	
	
	static void converUpper(String str) {
		//converting String to char type array 
				char[] ch = str.toCharArray();
				
				//using for loop to traverse array
				for(int i = 0; i < ch.length; i++)
				{
					//checking the range of charecter 
					if(ch[i] >= 'a' && ch[i] <= 'z') {
						//converting lower case to upper  case by substracting 32
						ch[i] = (char) ((int)ch[i] - 32);
					}
				}
				//Printing converted array using loop
				System.out.print("String is converted lower to upper acse =  ");
				
				for(int i = 0; i < ch.length; i++) {
					System.out.print(ch[i]);
				}
	}

}
