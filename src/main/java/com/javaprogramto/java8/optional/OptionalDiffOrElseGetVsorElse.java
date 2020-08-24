package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalDiffOrElseGetVsorElse {
	public static void main(String[] args) {

		// Optional with null value
		Optional<String> opt13 = Optional.ofNullable("123");
		String orElseValue3 = opt13.orElse(getDefaultValue());
		System.out.println("orElse() value : " + orElseValue3);

		// Optional with null value
		Optional<String> opt4 = Optional.ofNullable("789");
		String orElseValue4 = opt4.orElseGet(() -> getDefaultValue());
		System.out.println("orElseGet() value : " + orElseValue4);

	}

	public static String getDefaultValue() {

		System.out.println("executing to get the default value");
		return "I am  here to get the default value";
	}
}
