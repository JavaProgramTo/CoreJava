package com.javaprogramto.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalIfPresent {
	public static void main(String[] args) {

		System.out.println("Example 1 : ------ Optional string ------ ");
		// Creating optional
		Optional<String> optional = Optional.ofNullable("javaprogramto.com");

		// ifpresent syntax
		optional.ifPresent(value -> System.out.println(value));

		System.out.println("Example 2 : ------  Optional List of integers ------ ");

		// Creating list of numbers
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// Passing lsit to optional
		Optional<List<Integer>> numbersOfListOptional = Optional.ofNullable(list);

		// cheeking with ifpresent
		numbersOfListOptional.ifPresent(optionalList -> optionalList.forEach(v -> System.out.println(v)));

		Optional empty = Optional.empty();
		empty.ifPresent(valeu -> System.out.println("no value"));

	}
}
