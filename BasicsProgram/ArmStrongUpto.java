package BasicsProgram;
import java.lang.Math;
import java.util.Scanner;

public class ArmStrongUpto {
	static boolean Armstrong(int n) {
		int a,digits=0,last=0,s=0;
		double sum=0;
		a=n;
		while(a>0) {
			a=a/10;
			digits++;
		}
		a=n;
		while(a>0) {
			last=a%10;
			sum=sum+(Math.pow(last,digits));
			a=a/10;
		}
		if(n==sum) 
			return true;
		
		else return false;
		}
	
		
	

	public static void main(String[] args) {
		
		System.out.println("Enter a start Number:");
		int n;
		int s;
		System.out.println("ENTER a last number:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		
		n=sc.nextInt();
		System.out.println("ArmStrong Numbers"+s+"to"+n);
		for(int i=s;i<=n;i++) 
			if(Armstrong(i))
				System.out.print(i+",");
		}
		

	}


