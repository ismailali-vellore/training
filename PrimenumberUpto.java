package Program;

import java.util.Scanner;

public class PrimenumberUpto {
	static boolean primenumber (int n) {
		while (n==1 || n== 0) {
			return true;
		}
		if (n%2==0 || n %5==0) {
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		int s ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Starting Number:");
		s = sc.nextInt();
		System.out.println("Enter the last Number :");
		int n = sc.nextInt();
		System.out.println("primenumber"+s+"to"+n);
		
		for (int i = s; i<=n;i++) 
			if (primenumber (i))
				System.out.print(i+",");
	}
}
