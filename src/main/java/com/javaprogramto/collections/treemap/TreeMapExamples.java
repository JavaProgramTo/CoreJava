package com.javaprogramto.collections.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {

		Map<String, String> treeMap = new TreeMap<>();

		treeMap.put("0111", "one's");
		treeMap.put("0222", "two's");
		treeMap.put("0333", "three's");
		treeMap.put("0444", "four's");
		treeMap.put("0111", "one's modified");

		System.out.println("treeMap values are - " + treeMap);

		System.out.println("Iterating treeMap and modifying the values");

		Set<String> keys = treeMap.keySet();

		Iterator<String> iterator = keys.iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key - " + key + ", value - " + treeMap.get(key));
			if (key == "0333") {
				treeMap.remove(key);
			}
		}

	}

}
