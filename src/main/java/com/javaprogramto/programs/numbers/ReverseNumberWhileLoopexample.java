package com.javaprogramto.programs.numbers;

/**
 * Reversing a number using while loop in java.
 * 
 * Example: input- 12345, output - 54321
 * 
 * @author javaprogramto.com
 *
 */
public class ReverseNumberWhileLoopexample {

	public static void main(String[] args) {

		// creating a input number type integer
		int inputNumber = 12345;

		// printing the input number
		System.out.println("Input Number : " + inputNumber);

		// creating a variable to hold the reversed value.
		int outputReversedNumber = 0;

		while (inputNumber != 0) {

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
