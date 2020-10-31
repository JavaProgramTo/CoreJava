package com.javaprogramto.programs.large;

public class Largest3NumbersExample1 {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;
		int number3 = 30;

		if (number1 >= number2 && number1 >= number3) {
			System.out.println(number1 + " is the biggest");
		} else if (number2 >= number1 && number2 >= number3) {
			System.out.println(number2 + " is the biggest");
		} else {
			System.out.println(number3 + " is the biggest");
		}

	}

}
