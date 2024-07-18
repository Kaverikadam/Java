
public class DeveloperApp {

	public static void main(String[] args) {
		Developer dev;
		BackEndDeveloper bd;
		JavaDeveloper jd=new JavaDeveloper();
		
		dev=jd;//upcasting
		dev.coding();
		((BackEndDeveloper) dev).backEndProject();//down casting
		//dev.backEndProject();
		
		
		bd=jd;//up casting
		
		bd.backEndProject();
		bd.coding();
	
	}

}
