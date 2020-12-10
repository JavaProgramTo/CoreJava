package com.javaprogramto.java8.collectors.streamtolist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example on numbers Stream to List
 * 
 * @author javaprogramto.com
 *
 */
public class NumbersStreamToListExample {

	public static void main(String[] args) {

		// Creating a stream using of() method.
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		// Filtering the stream values to get only even numbers and next collect into ArrayList.
		List<Integer> finalList = stream.filter(e -> e % 2 == 0).collect(Collectors.toList());

		// printing
		System.out.println("Final ArrayList values : " + finalList);
	}
}
