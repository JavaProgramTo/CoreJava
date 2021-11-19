package com.javaprogramto.collections.hashmap.print;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPrintExample3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");

		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		set.forEach(System.out::println);

	}
}
