package com.javaprogramto.numbers.swap;

public class SwapNumbersWIthoutThirdVariable {

	public static void main(String[] args) {

		int firstNumber = 10;
		int secondNumber = 20;
		

		System.out.println("Before swapping two numbers : firstNumber "
		+ firstNumber + ", secondNumber " + secondNumber);
		
		

		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		

		System.out.println("After swapping two numbers : firstNumber "
		+ firstNumber + ", secondNumber " + secondNumber);
	}
}
