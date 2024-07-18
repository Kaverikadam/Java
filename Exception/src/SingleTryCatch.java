import java.util.Scanner;

public class SingleTryCatch {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Program  execution started");
			
			System.out.println("Enter size of array");
			int[] arr=new int[sc.nextInt()];
			System.out.println("Enter data");
			int data=sc.nextInt();
			
			System.out.println("Enter the index number where you want to store data");
			
			int index=sc.nextInt();
			arr[index]=data;
			
			System.out.println("The data is enterd successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
