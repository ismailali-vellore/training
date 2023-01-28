import java.util.Scanner;

public class Vowelcheck {

	public static void main(String[] args) {
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.nextLine();
		 for (int i=0;i<str.length();i++) {
			 if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|str.charAt(i)=='o'|| str.charAt(i)=='u' ) {
				 System.out.println("Given String contains:"+ str.charAt(i)+" "+"at the index"+"-"+i);
			 }
			 else {
				 System.out.println("The String does not contain any Vowels in it..");
			 }
		 }
		 
		

	}

}
