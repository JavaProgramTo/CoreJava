package com.javaprogramto.programs.numbers;

public class ReverseNumberForLoopexample {

	public static void main(String[] args) {

		// creating a input number type integer
		int inputNumber = 1234;

		// printing the input number
		System.out.println("Input Number : " + inputNumber);

		// creating a variable to hold the reversed value.
		int outputReversedNumber = 0;

		for (; inputNumber != 0;) {

			// taking last digit from number
			int lastDigit = inputNumber % 10;

			// adding last digit to the output value.
			outputReversedNumber = outputReversedNumber * 10 + lastDigit;

			// removing the last digit from number.
			inputNumber = inputNumber / 10;

		}

		// printing the output number after successful reversal.
		System.out.println("Reversed number : " + outputReversedNumber);

	}

}
