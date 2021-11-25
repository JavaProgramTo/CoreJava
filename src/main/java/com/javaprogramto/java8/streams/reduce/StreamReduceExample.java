package com.javaprogramto.java8.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		Optional<Integer> sumOptional = numbers.stream().reduce((currentSum, nextValue) -> currentSum + nextValue);

		if(sumOptional.isPresent()) {
			System.out.println("sum of first 7 numbers is "+sumOptional.get());
		}
	}

}
