package com.javaprogramto.java8.foreach.index;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Example program to run the forEach() loop with index in java 8 with an List
 * of Strings.
 * 
 * @author JavaProgramTo.com
 *
 */

public class ForEachIndexListExample {

	public static void main(String[] args) {

		// Create a List with Strings.
		List<String> players = Arrays.asList("Warner", "Ponting", "Akthar", "Sachin", "Gary Christian");

		// getting length of an List.
		int length = players.size();

		// running forEach loop with index using IntStream.range() method with start 0 and
		// end index as length
		IntStream.range(0, length).filter(index -> players.get(index).contains("a"))
				.forEach(index -> System.out.println("Value at Index : " + (index + 1) + " is " + players.get(index)));

	}

}
