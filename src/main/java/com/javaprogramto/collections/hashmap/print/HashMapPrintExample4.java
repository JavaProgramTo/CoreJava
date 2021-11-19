package com.javaprogramto.collections.hashmap.print;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPrintExample4 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");

		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println(key+" - "+map.get(key));
		}

	}
}
