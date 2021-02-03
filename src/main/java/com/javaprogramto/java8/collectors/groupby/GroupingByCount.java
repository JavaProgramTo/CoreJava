package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCount {

	public static void main(String[] args) {

		// Creating List and adding duplicate values. 
		List<String> strings = new ArrayList<>();

		strings.add("Hello");
		strings.add("Ram");
		strings.add("Hello");
		strings.add("Sam");
		strings.add("Hello");
		strings.add("Yam");
		strings.add("Hello");
		strings.add("Raj");
		strings.add("Hello");
		strings.add("Raj");

		// Grouping by based on the count
		Map<String, Long> countMap = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		// printing the count of each string. 
		System.out.println("Count : "+countMap);
	}
}
