package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalMapExample {
	public static void main(String[] args) {

		// Creating optional
		Optional<String> op = Optional.ofNullable("Welcome reader");

		Optional<String> mapOptional = op.map(value -> {
			if (value.contains("Welcome")) {
				return "Articles are good";
			} else {
				return "Welcome to javaprogramto.com";
			}

		});

		mapOptional.ifPresent(action -> System.out.println(action));
		
		// String value optional
		Optional<String> string = Optional.ofNullable("12345");
		
		// converting string to  number
		Optional<Integer> numberOptional  = string.map(value  -> Integer.parseInt(value));
		
		// printing the number using ifPresent()
		numberOptional.ifPresent(newValue -> System.out.println(newValue));

	}
}
