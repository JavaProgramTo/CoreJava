package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalObjectCreationExample {
	public static void main(String[] args) {

		// creating an empty optional object
		Optional<Void> emptyOptional = Optional.empty();

		// checking if the optional is empty or not
		System.out.println(" Is optional is empty : " + emptyOptional.isEmpty());

		// Creating String type Optional
		Optional<String> stringOptional = Optional.of("Hello");

		if (stringOptional.isPresent()) {
			System.out.println("Getting value from stringOptional : " + stringOptional.get());
		}

		// Integer type optional
		Optional<Integer> intOptionbal = Optional.of(1244);
		System.out.println("Integer Optional: " + intOptionbal.get());
		
		// Passing null to  of() method.
		Optional.of(null);

	}
}
