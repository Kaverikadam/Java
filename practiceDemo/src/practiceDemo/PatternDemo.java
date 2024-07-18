package practiceDemo;

public class PatternDemo {
	int n=5;
	int m=6;
	public void solid() {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		System.out.println();
	}
	public void hollow() {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0|| j==0|| i==n||j==m) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println();
	}
	public void pyramidHalf() {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------------");

	}
	
	
	public void rvsPyramidHalf() {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------------");
	}
	
	public void rvsPyramidHalfHollow() {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				if(i==0|| j==0|| i==n||j==m) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------------");
	} 
	
	
}


