package BasicsProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a;
		int b = 1;
		System.out.println("Enter a number:");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			b=b*i;
		}
		System.out.println("The Factoria of " +a+ " is " +b);

	}

}
