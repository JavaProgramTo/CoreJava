package com.javaprogramto.programs.count;

public class CountDigitsRecursiveExample {

	public static void main(String[] args) {

		// Input number
		int number = 1234567;

		int count = (int)Math.floor(Math.log10(number) + 1);

		// printing the output
		System.out.println("No of digits in number " + number + " is " + count);

	}
}
