package com.javaprogramto.programs.strings.todouble;

public class StringToDoubleExample2 {

	public static void main(String[] args) {

		// double value in string format
		String to_double = "1234";

		Double doubleValue = Double.valueOf(to_double);

		System.out.println("String to Double value with valueOf() : " + doubleValue);

		to_double = "100d";

		doubleValue = Double.valueOf(to_double);

		System.out.println("String to Double value with d in the string using valueOf() : " + doubleValue);

	}
}
