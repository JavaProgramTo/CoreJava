package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalOrElse {
	public static void main(String[] args) {

		Optional<String> o1 = Optional.ofNullable(null);
		
		String value = o1.orElse("Default One");
		
		System.out.println("Fetching the value from orElse() : "+value);
		
		Optional<Integer> intOptional = Optional.empty();
		
		int defaultValue = intOptional.orElse(15);
		
		System.out.println("Int  default value :"+defaultValue);

	}
}
