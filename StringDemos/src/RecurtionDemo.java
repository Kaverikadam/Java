
public class RecurtionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		
		display(5);

	}
	static void display(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("Inside display");
			display(--num);
		}
		while(num<=0) {
			System.out.println("Inside main");
			display(num--);
		}
	}

}
