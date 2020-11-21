package com.javaprogramto.java8.streams.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyParallelStreamExample {

	public static void main(String[] args) {

		// creating a list with string values
		List<String> values = Arrays.asList("A", "B", "C", "F", "D");

		// Creating parallel stream.
		Optional<String> anyValue = values.stream().parallel().findAny();

		// printing the value
		if (anyValue.isPresent()) {
			System.out.println("Any value from stream : " + anyValue.get());
		} else {
			System.out.println("No value presnt in the stream.");
		}
	}
}
