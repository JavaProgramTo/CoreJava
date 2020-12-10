package com.javaprogramto.java8.arraylist.tomap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesListToMapExample {

	public static void main(String[] args) {

		// creating a List
		List<String> list = Arrays.asList("one", "two", "three", "four", "five", "five");

		// List to Stream
		Stream<String> stream = list.stream();

		// Stream to map - key is the string and value is its length
		Map<String, Integer> map = stream
				.collect(Collectors.toMap(String::new, String::length, (oldValue, newValue) -> newValue + 1000));

		// printing input list and map
		System.out.println("List : " + list);
		System.out.println("Map : " + map);
	}
}
