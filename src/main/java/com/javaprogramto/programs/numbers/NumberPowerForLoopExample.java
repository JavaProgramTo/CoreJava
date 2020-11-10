package com.javaprogramto.programs.numbers;

public class NumberPowerForLoopExample {

	public static void main(String[] args) {

		// create two variables to store the base and exponenet values
		int base = 4;
		int exponent = 3;

		// printing the input values
		System.out.println("Base : " + base + ", Exponent : " + exponent);

		// a result variable to store the output
		int result = 1;

		// Calculating the power using for loop
		for (int i = 1; i <= exponent; i++) {
			result = result * base;
		}

		// Printing the output
		System.out.println("Result : " + result);

	}

}
