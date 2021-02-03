package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCountSort {

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

		Map<String, Long> groupBySorted = countMap.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

		// printing the count of each string and sorted
		System.out.println("Count sorted : " + groupBySorted);

		// Descending Order
		// Grouping by based on the count
		Map<String, Long> countMap2 = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> finalMapDescendingOrder = new LinkedHashMap<>();

		// Sort a map and add to finalMap
		countMap2.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMapDescendingOrder.put(e.getKey(), e.getValue()));

		System.out.println("Descending order sorted - " + finalMapDescendingOrder);

	}
}
