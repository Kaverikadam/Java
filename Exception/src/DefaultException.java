import java.util.Scanner;

public class DefaultException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//Without exception 
		int bal=10000;
		
		System.out.println("Enter yout pin : ");
		int pin=sc.nextInt();
		
		if(pin==5566) {
			System.out.println("Your pin is : "+bal);
		}
		else {
			System.out.println("Incorrect pin");
		}
		
		//With exceptio occurence 
		try {
			int bal1=10000;
			
			System.out.println("Enter yout pin : ");
			int pin1=sc.nextInt();
			
			if(pin1==5566) {
				System.out.println("Your pin is : "+bal);
			}
			else {
				System.out.println("Incorrect pin");
			}
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Thank you for visiting");
		}

	}

}
