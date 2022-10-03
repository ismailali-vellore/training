package BasicsProgram;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		String original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String or int:");
		original=sc.nextLine();
		int l=original.length();
		for(int i=l-1;i>=0;i--)
			reverse=reverse + original.charAt(i);
		if(original.equals(reverse)) 
			System.out.println("Enter the string or int is palindrome");
		else
			System.out.println("Enter the string or int is not a palindrome");
		

	
		
}
}