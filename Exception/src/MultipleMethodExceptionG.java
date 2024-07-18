import java.util.Scanner;

public class MultipleMethodExceptionG {

	public static void main(String[] args) {
		System.out.println("MAin method excecution started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		
		multiply(a, b);
		
		System.out.println("Main method execution ended");
	}
	static void multiply(int a, int b) {
		System.out.println("Multiply started");
		
		int mulRes=a*b;
		System.out.println("Multiply result : "+mulRes);
		
		divide(a, b);
		
		System.out.println("Multiply ended");
	}
	static void divide(int a,int b) {
		System.out.println("Division is strted");
		int divRes=a/b;
		System.out.println("Division result : "+divRes);
		
		System.out.println("Division is ended");
	}

}
