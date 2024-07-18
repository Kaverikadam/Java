import java.util.Scanner;

public class CountSymbolsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		String str=sc.next();
		
		countSymbols(str);
		
	}
	static void countSymbols(String str) {
		
		int number=0,upper=0,lower=0,special=0;
		
		
		for(int i=0;i<str.length();i++) {
			
			//char[] ch=str.toCharArray();
			
			char ch=str.charAt(i);
			
			if(ch>= '0' && ch<='9') {
				number++;
			}
			else if(ch>='A' && ch<='Z') {
				upper++;
			}
			else if(ch>='a' && ch<='z') {
				lower++;
			}
			else {
				special++;
			}
		}
		System.out.println("Number in given string "+number);
		System.out.println("\nUpper case charecter given in string "+upper);
		System.out.println("\nLower case charecter given in string "+lower);
		System.out.println("\nSpecial Sysmbols given in string "+special);
		
		//return (number+""+lower+""+upper+""+special)   
		//method type should be string while returning string type of value or 
		//values are returning with concatinate with string

	}

}
