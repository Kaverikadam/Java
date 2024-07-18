import java.util.Scanner;

public class ATMApp {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		withdrawAmt();
		
		

	}
	static void withdrawAmt() throws Exception {
		int pin=takePin();
		if(pin==5566) {
			System.out.println("Amount Withdraw successfully");
		}
		else {
			System.out.println("Two more attempts are left!!");
			pin=takePin();
			if(pin==5566) {
				System.out.println("Amount Withdraw successfully");
			}
			else {
				System.out.println("One more attempts are left!!");
				pin=takePin();
				if(pin==5566) {
					System.out.println("Amount Withdraw successfully");
				}
				else {
					InvalidPin ip=new InvalidPin();
					throw ip;
				}
				
			}
		}
	}
	static int takePin() throws Exception {
		System.out.println("Enter your pin : ");
		int pin=sc.nextInt();
		return pin;
		
	}

}
