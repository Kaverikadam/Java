

public class numprint extends Thread{
	
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
