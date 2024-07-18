

public class Program {
	public static void main(String[] args) {
		calc ap1=new calc();
		calc ap2=new calc();
		calc ap3=new calc();
		calc ap4=new calc();
		
		
		ap1.setName("add");
		ap2.setName("sub");
		ap3.setName("mul");
		ap4.setName("div");
		
		ap1.start();
		ap2.start();
		ap3.start();
		ap4.start();
		
		
		
		
	}
}
