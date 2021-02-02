package com.javaprogramto.collections.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMapByValues {

	public static void main(String[] args) {

		// creating HashMap
		Map<String, Integer> namesAges = new HashMap<>();

		// storing the values
		namesAges.put("Hari", 35);
		namesAges.put("Jhon", 30);
		namesAges.put("Jakey", 50);
		namesAges.put("kane", 45);

		// ascending order
		Map<String, Integer> sortByValueMap = namesAges.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
						(entry1, entry2) -> entry2, LinkedHashMap::new));

		System.out.println("HashMap before sorting by value - " + namesAges);
		System.out.println("HashMap after sorting by value - " + sortByValueMap);

		// ascending order step by step
		// Step 1: Getting the entry set from map
		Set<Map.Entry<String, Integer>> entrySet = namesAges.entrySet();

		// Step 2: converting entry set to stream
		Stream<Entry<String, Integer>> stream = entrySet.stream();

		// Step 3: comparator to sort using values.
		Comparator<Map.Entry<String, Integer>> comparator = Entry.comparingByValue();

		// Step 4: sorting the stream using comparator created in above step.
		Stream<Entry<String, Integer>> sortedStream = stream.sorted(comparator);

		// Step 5: Getting the each key and value from entry object from above stream.
		// Finally, adding each entry to the LinkedHashMap.
		// LinkedHashMap is used to preserve the insertion order. If you do not collect
		// object into LinkedHashMap then final sorted map looks like same as the
		// original map before sorting.
		Collector<Entry<String, Integer>, ?, Map<String, Integer>> toMap = Collectors.toMap(entry -> entry.getKey(),
				entry -> entry.getValue(), (entry1, entry2) -> entry2, LinkedHashMap::new);

		// Step 6: Collecting the sorted stream into Map.
		Map<String, Integer> finalSortedByValueMap = sortedStream.collect(toMap);

		// printing
		System.out.println("HashMap before sorting by value - " + namesAges);
		System.out.println("HashMap after sorting by value - " + finalSortedByValueMap);

		
		// descending order
		Map<String, Integer> sortedMapInDescending = namesAges.entrySet()
															.stream()
															.sorted(Collections.reverseOrder(Entry.comparingByValue()))
															.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
																	(entry1, entry2) -> entry2, LinkedHashMap::new));
		
		// printing
		System.out.println("HashMap before sorting by value - " + namesAges);
		System.out.println("HashMap after sorting by value in descending order- " + sortedMapInDescending);
		
		// sorting by method reference
		
		// descending order
		Map<String, Integer> sortedMapInDescendingOrder = namesAges.entrySet()
															.stream()
															.sorted(Collections.reverseOrder(Entry.comparingByValue()))
															.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
																	(entry1, entry2) -> entry2, LinkedHashMap::new));

	}

}
