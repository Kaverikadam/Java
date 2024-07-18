import java.util.Scanner;

public class PreservedEhiteSpaces {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a string :");
		
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		char[] revArr=new char[arr.length];
		int j=revArr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				revArr[i]=' ';
			}
			if(arr[i] != ' ') {
				if(revArr[j]==' ') {
					j--;
				}
				revArr[j]=arr[i];
				j--;
			}
			
		}
		
		String str1=new String(revArr);
		System.out.println(str1);
		
	}
	
}
