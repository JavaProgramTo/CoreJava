package com.javaprogramto.collections.treemap.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorCustomObjectsExample4 {

	public static void main(String[] args) {

		Map<Customer, Integer> customerAgeMap = new TreeMap<>(Comparator.comparing(Customer::getId));

		customerAgeMap.put(new Customer(123, "D"), 30);
		customerAgeMap.put(new Customer(102, "B"), 70);
		customerAgeMap.put(new Customer(135, "A"), 40);
		customerAgeMap.put(new Customer(130, "C"), 50);

		System.out.println("java 8 - treemap sort by id - " + customerAgeMap);
		
		Map<Customer, Integer> customerAgeMap2 = new TreeMap<>(Comparator.comparing(Customer::getName));

		customerAgeMap2.put(new Customer(123, "D"), 30);
		customerAgeMap2.put(new Customer(102, "B"), 70);
		customerAgeMap2.put(new Customer(135, "A"), 40);
		customerAgeMap2.put(new Customer(130, "C"), 50);

		System.out.println("java 8 - treemap sort by name - " + customerAgeMap2);

	}
}
