import java.util.Scanner;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String orgStr=sc.nextLine();
		sc.close();
		
		String[] arr=orgStr.split("\\s");
		String revString="";
		
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--) {
				revWord = revWord + word.charAt(j);
			}
			revString=revString+revWord+" ";
		}
		
		System.out.println("Reversed String \n"+revString);
		System.out.println();
		
		
		
		
	}
	

}





























