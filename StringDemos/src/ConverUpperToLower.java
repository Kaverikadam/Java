import java.util.Scanner;

public class ConverUpperToLower {

	public static void main(String[] args) {
		
		//convert all upper case charecter to lower case charecters
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//asking user to enter astring
		System.out.println("Enter a string ");
		//reading user input and storing it to string type of variable
		String str=sc.next();
		
		//invokinf method
		convertLower(str);
		
		sc.close();
		
	}
	static void convertLower(String str) {
		//converting String to char type array 
				char[] ch = str.toCharArray();
				
				//using for loop to traverse array
				for(int i = 0; i < ch.length; i++)
				{
					//checking the range of charecter 
					if(ch[i] >= 'A' && ch[i] <= 'Z') {
						//converting lower case to upper  case by adding 32
						ch[i] = (char) ((int)ch[i] + 32);
					}
				}
				//Printing converted array using loop
				System.out.print("String converted =  ");
				for(int i = 0; i < ch.length; i++) {
					System.out.print(ch[i]);
				}
	}
	
	
	
}
