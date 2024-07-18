import java.util.Scanner;

public class UsingArrayDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in)
;
		System.out.println("Enetr a string :");
		String str=sc.next();
		
		char[] ch1=str.toCharArray();
		
		char[] ch2=new char[ch1.length];
		int index=0;
		for(int i=0;i<ch1.length;i++) {
			boolean status=false;
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					status =false;
					break;
				}
				if(status==false) {
					ch2[index]=ch1[i];
					index++;
				}
			}
		}
		String s1=new String(ch2);
		System.out.println("After removing duplicate "+s1);
	}

}
