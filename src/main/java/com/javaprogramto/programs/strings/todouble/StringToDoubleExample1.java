package com.javaprogramto.programs.strings.todouble;

public class StringToDoubleExample1 {

	public static void main(String[] args) {

		// double value in string format
		String to_double = "1234";

		double doubleValue = Double.parseDouble(to_double);

		System.out.println("String to Double value : " + doubleValue);

		to_double = "100d";

		doubleValue = Double.parseDouble(to_double);

		System.out.println("String to Double value with d in the string : " + doubleValue);

	}
}
