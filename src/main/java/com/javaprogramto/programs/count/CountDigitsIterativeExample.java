package com.javaprogramto.programs.count;

public class CountDigitsIterativeExample {

	public static void main(String[] args) {

		// Input number
		int number = 12345;

		// storing the original number in temp variable
		int originalNumber = number;

		// default digits count
		int countDigits = 0;

		// counting the digits
		while (number > 0) {

			number = number / 10;
			countDigits++;

		}

		// printing the output
		System.out.println("No of digits in number " + originalNumber + " is " + countDigits);

	}

}
