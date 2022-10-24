package Program;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		int year ;
		System.out.println("Enter the Year:");
		Scanner sc = new Scanner (System.in);
		year = sc.nextInt();
		if (year%4==0 && (year%100!=0)) {
			System.out.println("It is a Leap Year");
		}
		
		else {
			System.out.println("Not a Leap Year");
		}

	}

}
