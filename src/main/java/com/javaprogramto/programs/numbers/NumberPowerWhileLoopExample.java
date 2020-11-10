package com.javaprogramto.programs.numbers;

public class NumberPowerWhileLoopExample {

	public static void main(String[] args) {

		// create two variables to store the base and exponenet values
		int base = 5;
		int exponent = 4;

		// printing the input values
		System.out.println("Base : " + base + ", Exponent : " + exponent);

		// a result variable to store the output
		int result = 1;

		// Calculating the power using while loop
		while (exponent > 0) {
			result = result * base;
			exponent--;
		}

		// Printing the output
		System.out.println("Result : " + result);

	}

}
