package com.javaprogramto.java8.collectors.streamtolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example Stream to List
 * 
 * @author javaprogramto.com
 *
 */
public class StreamToListExample {

	public static void main(String[] args) {
		// creating an list
		List<String> names = Arrays.asList("Nick", "Boran", "Tison", "Sunshine");

		// converting list to stream
		Stream<String> stream = names.stream();

		// finally collecting the stream values into a list with any filtering the
		// objects.
		List<String> finalList = stream.collect(Collectors.toList());

		// printing
		System.out.println("List values : " + finalList);
	}
}
