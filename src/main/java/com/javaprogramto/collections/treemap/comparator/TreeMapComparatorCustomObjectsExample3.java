package com.javaprogramto.collections.treemap.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorCustomObjectsExample3 {

	public static void main(String[] args) {

		Map<Customer, Integer> customerAgeMap = new TreeMap<>(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				String name1 = o1.getName();
				String name2 = o2.getName();
				
				return name1.compareTo(name2);
			}
		});

		customerAgeMap.put(new Customer(123, "D"), 30);
		customerAgeMap.put(new Customer(102, "B"), 70);
		customerAgeMap.put(new Customer(135, "A"), 40);
		customerAgeMap.put(new Customer(130, "C"), 50);

		System.out.println("treemap - " + customerAgeMap);

	}
}
