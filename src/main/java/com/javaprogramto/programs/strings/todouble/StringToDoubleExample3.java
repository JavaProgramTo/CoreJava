package com.javaprogramto.programs.strings.todouble;

public class StringToDoubleExample3 {

	public static void main(String[] args) {

		// double value in string format
		String to_double = "1234";

		Double doubleValue = new Double(to_double);

		System.out.println("String to Double value with Double constructor : " + doubleValue);

		to_double = "100d";

		doubleValue = new Double(to_double);

		System.out.println("String to Double value with d in the string using Double constructor : " + doubleValue);

	}
}
