package com.javaprogramto.java8.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;

public class StreamReduceExample6 {

	static Logger log = org.slf4j.LoggerFactory.getLogger(StreamReduceExample5.class);

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 0, 5, 6, 7);

		Optional<Integer> division = numbers.stream().reduce((currentSum, nextValue) -> doDivision(currentSum, nextValue));

		if (division.isPresent()) {
			System.out.println("division of first 7 numbers is " + division.get());
		}
	}

	private static int doDivision(Integer currentSum, Integer nextValue) {
		int div = 0;
		try {
			div = currentSum / nextValue;

		} catch (ArithmeticException e) {
			log.error("arithmetic exception thrown");
		}
		return div;
	}
}
