package BasicsProgram;

import java.util.Scanner;

public class palindromeupto {
	static boolean palindrome(int n) {
	int temp,r,sum=0,s;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(sum==temp)
		return true;
	else
		return false;
	}
	

	public static void main(String[] args) {
		int n;
		int s;
		System.out.println("Enter a start number:");
		Scanner sc = new Scanner(System.in);
		
		s=sc.nextInt();
		System.out.println("Enter the end number:");
		n=sc.nextInt();
		
		for(int i=s;i<=n;i++) 
			if(palindrome(i))
				System.out.print(i+" ");
	}

}
