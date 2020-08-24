package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalflatmapExample {
	public static void main(String[] args) {

		Optional<String> optional1 = Optional.of("Hello Java 8 Optional");
		Optional<Optional<String>> optional2 = Optional.of(optional1);

		System.out.println("Optional2 value : " + optional2);

		Optional<String> output = optional2.flatMap(value -> value.map(String::toLowerCase));

		System.out.println("output value : " + output);

	}
}
