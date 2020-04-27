package com.javaprogramto.numbers.swap;

public class SwapNumbersTemp {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swapping two numbers : a " + a + ", b " + b);
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping two numbers : a " + a + ", b " + b);
	}
}
