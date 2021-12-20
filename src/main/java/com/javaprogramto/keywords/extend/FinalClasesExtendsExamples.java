package com.javaprogramto.keywords.extend;

import java.util.Calendar;

public class FinalClasesExtendsExamples {

	public static void main(String[] args) {

	}
}

final class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int reminder(int a, int b) {
		return a % b;
	}

}

class MyCalculator extends Calendar{
	
	
}