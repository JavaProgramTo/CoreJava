package com.javaprogramto.java8.collectors.streamtolist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Example on Infinite Stream to List
 * 
 * @author javaprogramto.com
 *
 */
public class InfiniteStreamToListExample {

	public static void main(String[] args) {

		// Creating the infinite even numbers stream using iterate() starts from value
		// 10.
		IntStream infiniteStream = IntStream.iterate(10, i -> i + 2);

		// limit() + boxed() + toList() example
		List<Integer> finalList = infiniteStream.limit(10).boxed().collect(Collectors.toList());

		// printing
		System.out.println("List values : " + finalList);
	}
}
