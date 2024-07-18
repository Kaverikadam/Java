import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		
		String[] arr=str.split("\\s");
		String[] ar=new String[arr.length];
		int j=ar.length-1;
		for(int i=0;i<ar.length;i++) {
			ar[j]=arr[i];
			j--;
		}
		
		System.out.println("Reverse String words ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("\n");
		reverseStr(str);
		

	}
	static void reverseStr(String str) {
		String[] arr=str.split(" ");
		String[] words=new String[arr.length];
		
		int j=arr.length-1;
		for (int i = 0; i < words.length; i++) {
			words[i]=arr[j];
			j--;
		}
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}























