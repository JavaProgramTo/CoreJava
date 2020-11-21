package com.javaprogramto.java8.streams.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyParallelStreamIntegersExample {

	public static void main(String[] args) {

		// creating a list with integer prime values
		List<Integer> values = Arrays.asList(2, 3, null, 7, 11);

		// Creating prallel stream.
		Optional<Integer> anyValue = values.stream().parallel().findAny();

		// printing the value
		if (anyValue.isPresent()) {
			System.out.println("Value from integer stream : " + anyValue.get());
		} else {
			System.out.println("No value presnt in the stream.");
		}
	}
}
