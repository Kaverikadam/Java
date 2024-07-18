import java.util.Scanner;

public class ReThrowingException {

	public static void main(String[] args) {
		try {
			System.out.println("Shopping is started");
			shopping();
			System.out.println("Shopping is completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void shopping() throws Exception {
		try {
			System.out.println("Payment is started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Amout : ");
			int amount=sc.nextInt();
			System.out.println("Total amount paid");
			System.out.println("Payment is completed");
		}
		catch(Exception e) {
			System.out.println("Exception is handeld in payment");
			System.out.println("Payment is failed");
			throw e;
		}
	}

}
