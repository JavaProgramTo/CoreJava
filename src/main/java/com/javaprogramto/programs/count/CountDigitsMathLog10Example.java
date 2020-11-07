package com.javaprogramto.programs.count;

public class CountDigitsMathLog10Example {

	public static void main(String[] args) {

		// Input number
		int number = 123;

		String numberInString = Integer.toString(number);
		
		int length = numberInString.length();

		// printing the output
		System.out.println("No of digits in number " + number + " is " + length);


	}
}
