package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalIfPresentExample {
	public static void main(String[] args) {

		// String value optional
		Optional<String> string = Optional.ofNullable("12345");

		// converting string to number
		Optional<Integer> numberOptional = string.map(value -> Integer.parseInt(value));

		// printing the number using ifPresent()
		numberOptional.ifPresent(newValue -> System.out.println(newValue));

	}
}
