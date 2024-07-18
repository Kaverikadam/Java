import java.io.IOException;
import java.util.InputMismatchException;

class Parent{
	void disp() throws ArithmeticException, IOException{
		System.out.println("Inside Parent");
	}
}
class Child1 extends Parent{
	void disp() throws IOException{
		System.out.println("Inside Child1");
	}
}
class child2 extends Parent{
	void disp() throws InputMismatchException{
		System.out.println("Inside Child2");
	}
}
class child3 extends Parent{
	void disp() throws StringIndexOutOfBoundsException{
		System.out.println("Inside Child3");
	}
}

public class RuleFour {

	public static void main(String[] args) {
		child3 c3=new child3();
		c3.disp();

	}

}
