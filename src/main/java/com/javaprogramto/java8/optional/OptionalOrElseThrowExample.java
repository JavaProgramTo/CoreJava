package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {
	public static void main(String[] args) {

		// orElseThrow() example
		String blank = Optional.ofNullable("").orElseThrow();
		System.out.println(blank);

		String value = null;
		String blank2 = Optional.ofNullable(value).orElseThrow();
		System.out.println(blank2);

	}
}
