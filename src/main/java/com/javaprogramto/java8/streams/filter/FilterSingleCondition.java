package com.javaprogramto.java8.streams.filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example to filter the steam with single condition.
 * 
 * @author javaprogramto.com
 *
 */
public class FilterSingleCondition {

	public static void main(String[] args) {

		System.out.println("Fruites stream : " + getStream().collect(Collectors.toList()));

		// filter 1
		Predicate<String> nofruitWordFilter = name -> !name.contains("fruit");

		List<String> filteredList1 = getStream().filter(nofruitWordFilter).collect(Collectors.toList());

		System.out.println("filteredList 1 : " + filteredList1);

		// filter 1
		Predicate<String> noLetterOFilter = name -> !name.contains("o");

		List<String> noLetterOFilterList = getStream().filter(noLetterOFilter).collect(Collectors.toList());

		System.out.println("noLetterOFilterList : " + noLetterOFilterList);

	}

	// creating the stream of strings.
	private static Stream<String> getStream() {
		Stream<String> fruitesStream = Stream.of("mango", "grapes", "apple", "papaya", "jack fruit", "dragon fruit");
		return fruitesStream;

	}

}
