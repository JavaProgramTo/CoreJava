package com.javaprogramto.programs.numbers;

public class NumberPowerMathPowExample {

	public static void main(String[] args) {

		// create two variables to store the base and exponenet values
		int base = 5;
		int exponent = 7;

		// printing the input values
		System.out.println("Base : " + base + ", Exponent : " + exponent);

		// a result variable to store the output
		double result = 1;

		// Calculating the power using Math.pow() method
		result = Math.pow(base, exponent);

		// Printing the output
		System.out.println("Result : " + result);
	}
}
