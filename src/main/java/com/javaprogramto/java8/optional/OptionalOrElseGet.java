package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalOrElseGet {
	public static void main(String[] args) {

		Optional<String> o1 = Optional.ofNullable(null);

		String value = o1.orElseGet(() -> "Default One  from  supplier");

		System.out.println("Fetching the value from orElseGet() : " + value);

		Optional<Integer> intOptional = Optional.of(134);

		int defaultValue = intOptional.orElseGet(() -> 15);

		System.out.println("orElseGet Int  default value :" + defaultValue);

	}
}
