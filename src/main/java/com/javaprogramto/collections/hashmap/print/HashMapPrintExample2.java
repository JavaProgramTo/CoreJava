package com.javaprogramto.collections.hashmap.print;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPrintExample2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");

		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		
		it.forEachRemaining( entry -> System.out.println(entry.getKey() + " - "+entry.getValue()));
	}
}
