
public class AirlineApp {
	public static void main(String[] args) {
		Pilot p=new Pilot("Kaveri");
		p.fly();
		
		Airline ar=new Airline("Indigo", p);
		ar.activity();
		ar=null;
		//ar.activity();
		p.fly();
	}

}
