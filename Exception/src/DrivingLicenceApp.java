import java.util.Scanner;

public class DrivingLicenceApp {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		applyDrivingLicence(age);
		
		
	}
	static void applyDrivingLicence(int age) throws Exception {
		if(age>=18) {
			System.out.println("You can apply for driving licence...");
		}
		else {
			InvalidAge ia=new InvalidAge();
			throw ia;
		}
	}

}
