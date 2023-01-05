package BasicsProgram;

import java.util.Scanner;

public class ATMmachine {

	public static void main(String[] args) {
		int balance=100000,deposit,withdrawal;
		
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println("choose 1 for withdrawal");
		System.out.println("choose 2 for deposit");
		System.out.println("choose 3 for chech balance");
		System.out.println("choose 4 for exit");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter money to withdrawal:");
			withdrawal=sc.nextInt();
			
			if(balance > withdrawal) {
				balance = balance - withdrawal;
				System.out.println("Please collect your money");
			}
			else {
				System.out.println("insufficent balance");
			}
			System.out.println("");
			break;
			
		case 2:
			System.out.println("Enter money to deposit:");
			deposit =sc.nextInt();
			
			balance = balance + deposit;
			System.out.println("your ammount deposited successfully");
			System.out.println("");
			break;
			
		case 3:
			System.out.println("balance"+balance);
			System.out.println("");
			break;
			
		case 4:
			System.exit(0);
		}
	}

}}
