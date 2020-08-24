package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalIsPresent {
	public static void main(String[] args) {

		// Creating optional
		Optional<String> ofNullable = Optional.ofNullable("Non null value");

		String content = ofNullable.get();
		System.out.println("Offnullable value :" + content);

		// passing null value
		Optional<Void> nullOptional = Optional.ofNullable(null);
		
	}
}
