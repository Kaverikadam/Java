import java.util.Scanner;

public class calc extends Thread {
	
	public void run() {
		if(getName().equals("add")) {
			add();
		}
		else if(getName().equals("sub")) {
			sub();
		}
		else if(getName().equals("mul")) {
			mul();
		}
		else if(getName().equals("div")) {
			div();
		}
		
	}
	static void add() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 numbers for addition");
			int a=sc.nextInt();
			System.out.println("Enter 2 numbers for addition");
			int b=sc.nextInt();
	
			int res=a+b;
			System.out.println("Addition : "+res);
		
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	static void sub() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 numbers for substraction");
			int a=sc.nextInt();
			System.out.println("Enter 2 numbers for substraction");
			int b=sc.nextInt();
			
			int res=a-b;
			System.out.println("substraction : "+res);
		
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	static void mul() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 numbers for multiplication");
			int a=sc.nextInt();
			System.out.println("Enter 2  numbers for multiplication");
			int b=sc.nextInt();
		
			int res=a*b;
			System.out.println("multiplication : "+res);
		
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	static void div() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 numbers for division");
			int a=sc.nextInt();
			System.out.println("Enter 2 numbers for division");
			int b=sc.nextInt();
		
			int res=a/b;
			System.out.println("division : "+res);
		
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
