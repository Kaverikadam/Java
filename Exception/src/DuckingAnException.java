import java.util.Scanner;

public class DuckingAnException {
	public static void main(String[] args) {
		shopping();
		
	}
	static void shopping() {
		
		try {
			System.out.println("Shopping is started");
			payment();
			System.out.println("Shopping is completed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Visit Again");
		}
		
	}
	static void payment() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Payment is started");
		System.out.println("Enter amount ");
		int amt=sc.nextInt();
		
		System.out.println("Amont susscessfully paid "+amt);
		System.out.println("Payment completed");
	}
}
