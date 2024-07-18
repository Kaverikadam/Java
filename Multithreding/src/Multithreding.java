
public class Multithreding {

	public static void main(String[] args) {
		numprint np=new numprint();
		add ad=new add();
		np.start();
		ad.start();
	}

}
