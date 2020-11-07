package com.javaprogramto.programs.count;

public class CountDigitsRecursiveExample {

	public static void main(String[] args) {

		// Input number
		int number = 123456789;

		// calling the recursive method
		int digitsCount = countDigits(number);

		// printing the output
		System.out.println("No of digits in number " + number + " is " + digitsCount);

	}

	/**
	 * returns the count of digits in the given number
	 * 
	 * @param number
	 * @return
	 */
	public static int countDigits(int number) {

		if (number == 0) {
			return 0;
		}

		return 1 + countDigits(number / 10);
	}
}
