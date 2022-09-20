package com.sampleprog;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.add(50);
		calc.add(25);
		calc.printResult();
		calc.subtract(40);
		calc.printResult();
		calc.multiply(3);
		calc.printResult();
		calc.divide(30);
		calc.printResult();
		
		int res = calc.add(50, 14);
		System.out.println(res);
		calc.printResult();
	}
}
