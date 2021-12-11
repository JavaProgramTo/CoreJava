package com.javaprogramto.collections.treemap.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorCustomObjectsExample2 {

	public static void main(String[] args) {

		Map<Customer, Integer> customerAgeMap = new TreeMap<>(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				Integer id1 = o1.getId();
				Integer id2 = o2.getId();
				return id1.compareTo(id2);
			}
		});

		customerAgeMap.put(new Customer(123, "D"), 30);
		customerAgeMap.put(new Customer(102, "B"), 70);
		customerAgeMap.put(new Customer(135, "A"), 40);
		customerAgeMap.put(new Customer(130, "C"), 50);

		System.out.println("treemap with comparator - " + customerAgeMap);

	}
}
