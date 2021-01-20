package com.javaprogramto.collections.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIterate {

	public static void main(String[] args) {
		
		// Creating the TreeMap object
		Map<String, Integer> studentsCountMap = new TreeMap<>();
		
		// Adding students class and no of students in the class
		studentsCountMap.put("2nd class", 200);
		studentsCountMap.put("1nd class", 100);
		studentsCountMap.put("4nd class", 400);
		studentsCountMap.put("5nd class", 500);
		studentsCountMap.put("3nd class", 300);
		
		// Getting the Set object using keySet() method
		Set<String> keysSet = studentsCountMap.keySet();
		
		// Getting the iterator object
		Iterator<String > it = keysSet.iterator();
		
		// Iterating the map using regular method of iterator.
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("Key - "+key+", Value - "+studentsCountMap.get(key));
		}

	}

}
