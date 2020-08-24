package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalIsEmpty {
	public static void main(String[] args) {

		// Creating optional
		Optional<String> optional = Optional.ofNullable("javaprogramto.com");

		System.out.println("Checking if optional has value with isEmpty() method");
		System.out.println("isEmpty value : " + optional.isEmpty());

		// empty optional
		Optional<String> emptyOptional = Optional.ofNullable(null);
		System.out.println("isPreisEmptysent value for empty optional : " + emptyOptional.isEmpty());

	}
}
