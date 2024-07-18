import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a string :");
		String str=sc.next();
		
		String newStr="";
		/*for(int i=0;i<str.length();i++) {
			if(!newStr.contains(str.charAt(i)+"")) {
				newStr+=str.charAt(i);
			}
		}
		
		System.out.println(newStr);*/
		
		char[] arr1=str.toCharArray();
		
		char[] arr2=new char[arr1.length];
				
		for (int i = 0; i <arr1.length; i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]!=arr1[j]) {
					arr2[i]=arr1[i];
				}
				
			}
		}
		String s1=new String(arr2);
		System.out.println(s1);
	}

}
