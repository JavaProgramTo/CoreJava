package com.javaprogramto.collections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapReversedescendingkeymapExample {

	public static void main(String[] args) {

		// Creating the TreeMap object with default constructor
		TreeMap<String, Integer> studentsCountMap = new TreeMap<>();

		// Adding students class and no of students in the class
		studentsCountMap.put("2nd class", 200);
		studentsCountMap.put("1nd class", 100);
		studentsCountMap.put("4nd class", 400);
		studentsCountMap.put("5nd class", 500);
		studentsCountMap.put("3nd class", 300);

		// Getting all keys as Set object using descendingKeySet()
		Map<String, Integer> map = studentsCountMap.descendingMap();

		map.forEach((key, value) -> System.out.println("Key - " + key + ", Value - " + value));
	}
}
