package com.javaprogramto.java8.collectors.streamtolist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example Stream to LinkedList
 * 
 * @author javaprogramto.com
 *
 */
public class StreamToLinkedListExample {

	public static void main(String[] args) {
		// creating an list
		List<String> values = Arrays.asList("1", "2", "3", "4", "5");

		// converting list to stream
		Stream<String> stream = values.stream();

		// Collecting the stream values into a LinkedList using stream collectors.
		LinkedList<String> linkedList = stream.collect(Collectors.toCollection(LinkedList::new));

		// printing
		System.out.println("LinkedList values : " + linkedList);
	}
}
