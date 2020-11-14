package com.javaprogramto.programs.numbers;

public class ArmstrongNumberExample {

	public static void main(String[] args) {

		// storing the input number
		int number = 153;
		
		// original number
		int originalNumber = number;

		// cubic sum of each digit
		double sumCubic = 0;
		
		// getting cubic sum of each digit and adding to sumCubic varaible
		while (number > 0) {
			int digit = number % 10;
			sumCubic = sumCubic + Math.pow(digit, 3);
			number = number / 10;

		}
		
		// comparing the original value and result sumCubic
		if(originalNumber == sumCubic) {
			System.out.println(originalNumber+" number is armstrong");
		} else {
			System.out.println(originalNumber+" number is not armstrong");
		}

	}

}
