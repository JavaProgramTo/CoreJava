package com.javaprogramto.collections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapIterateJava8 {

	public static void main(String[] args) {

		// Creating the TreeMap object
		Map<String, Integer> studentsCountMap = new TreeMap<>();

		// Adding students class and no of students in the class
		studentsCountMap.put("2nd class", 200);
		studentsCountMap.put("1nd class", 100);
		studentsCountMap.put("4nd class", 400);
		studentsCountMap.put("5nd class", 500);
		studentsCountMap.put("3nd class", 300);

		// Java 8 lambda foreach
		studentsCountMap.forEach((key, value) -> {
			System.out.println("Key - " + key + ", Value - " + value);
		});

		// java 8 Stream entry forEach
		studentsCountMap.entrySet().stream().forEach(
				entry -> System.out.println("entry key - " + entry.getKey() + ", entry value - " + entry.getValue()));
	}
}
