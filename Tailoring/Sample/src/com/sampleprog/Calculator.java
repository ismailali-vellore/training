package com.sampleprog;

public class Calculator {
	
	private int result = 0;
	private int lastResult = 0;
	
	public void add(int number) {
		this.result +=number;
	}
	
	public void subtract(int number) {
		this.result -= number;
				
	}
	
	public void multiply (int number) {
		this.result *=number;
	}
	
	public void divide (int number) {
		this.result =(int) (this.result / number);
	}
	
	public void reset () {
		this.result = 0;
	}
	
	public void printResult() {
		System.out.println(this.result);
	}
	
	public int add(int num1, int num2) {
		return num1+num2;
	}

}
