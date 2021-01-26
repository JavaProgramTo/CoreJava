package com.javaprogramto.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {

		Map<String, String> hashMap = new HashMap<>();

		hashMap.put("0111", "one's");
		hashMap.put("0222", "two's");
		hashMap.put("0333", "three's");
		hashMap.put("0444", "four's");
		hashMap.put("0111", "one's modified");

		System.out.println("HashMap values are - " + hashMap);

		System.out.println("Iterating Hashmap and modifying the values");

		Set<String> keys = hashMap.keySet();

		Iterator<String> iterator = keys.iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key - " + key + ", value - " + hashMap.get(key));
			if (key == "0333") {
				hashMap.remove(key);
			}
		}

	}

}
