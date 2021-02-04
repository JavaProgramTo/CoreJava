package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByModifyValueTypeSet {

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

		// Grouping by - change the Map value type
		// Map type - <String, Set<String>>
		Map<String, Set<String>> mapValueType = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.toSet()));

		System.out.println("Set group by : " + mapValueType);
	}
}
