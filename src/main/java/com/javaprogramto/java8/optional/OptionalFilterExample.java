package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalFilterExample {
	public static void main(String[] args) {

		// Creating optional
		Optional<Integer> op = Optional.ofNullable(1234);

		Optional<Integer> evenOrNot = op.filter(number -> number % 2 == 0);
/*
		if (evenOrNot.isEmpty()) {
			System.out.println("Odd number");
		} else {
			System.out.println("Even number");
		}
*/
	}
}
