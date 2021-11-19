package com.javaprogramto.collections.hashmap.print;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapPrintExample5 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");

		BiConsumer<Integer, String> printBiConsumer = (key, value) -> System.out.println(key+" - "+value);
		
		map.forEach(printBiConsumer);
	}
}
