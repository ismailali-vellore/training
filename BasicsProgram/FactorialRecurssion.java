package BasicsProgram;

public class FactorialRecurssion {
	static int factorial(int n) {
		if(n==0) 
			return 1;
		else
			return(n * factorial(n-1));
	}
	
		
	

	public static void main(String[] args) {
		int i,fact =1;
		int n=5;
		System.out.println("The Factorial of "+n+" is "+factorial(n));
		

	}

}
