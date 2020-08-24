package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OfNullableExample {
	public static void main(String[] args) {

		// Creating optional
		Optional<String> optional = Optional.ofNullable("javaprogramto.com");

		System.out.println("Checking if optional has value with isEmpty() method");
		System.out.println("isEmpty value : "+optional.isPresent());
		
		// empty optional
		Optional<String> emptyOptional = Optional.ofNullable(null);
		System.out.println("isPresent value for empty optional : "+emptyOptional.isPresent());
		
	}
}
