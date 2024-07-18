
public class Demos {
	static int a=10;
	static int b=20;
	int x=50;
	int y=80;
	static {
		//a=90;
		System.out.println("Static block "+(a+b));
		//System.out.println("Static block"+(x+y));
	}
	static void add() {
		System.out.println("Static method "+(a+b));
		//System.out.println("Static method"+(x+y));
	}
	{
		System.out.println("Local block static variables "+(a+b));
		System.out.println("Local block instance var "+(x+y));
	}
	void add1() {
		System.out.println("Local method static variables  "+(a+b));
		System.out.println("Local method instance var "+(x+y));
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demos.add();
		Demos d=new Demos();
		d.add1();
		

	}

}
