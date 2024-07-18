import java.util.Scanner;

public class StringRvsUsingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String ");
		String str=sc.next();
		
		String org=str;
		char[] arr=str.toCharArray();
		char[] newArr=new char[arr.length];
		
		int j=newArr.length-1;
		
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]=arr[j];
			j--;
		}
		String str1=new String(newArr);
		
		if(org.equals(str1)) {
			System.out.println("Enterd string ia palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
	}

}
