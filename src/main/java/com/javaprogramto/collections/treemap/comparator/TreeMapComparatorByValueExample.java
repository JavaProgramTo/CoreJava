package com.javaprogramto.collections.treemap.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapComparatorByValueExample {

	public static void main(String[] args) {

		// sorted set with the custom comparator
		SortedSet<Map.Entry<Customer, Integer>> sortedset = new TreeSet<>(
				new Comparator<Map.Entry<Customer, Integer>>() {
					@Override
					public int compare(Map.Entry<Customer, Integer> e1, Map.Entry<Customer, Integer> e2) {
						return e1.getValue().compareTo(e2.getValue());
					}
				});

		Map<Customer, Integer> customerAgeMap = new TreeMap<>(Comparator.comparing(Customer::getId));

		customerAgeMap.put(new Customer(123, "D"), 30);
		customerAgeMap.put(new Customer(102, "B"), 70);
		customerAgeMap.put(new Customer(135, "A"), 40);
		customerAgeMap.put(new Customer(130, "C"), 50);

		// adding treemap values to the treeset.
		
		sortedset.addAll(customerAgeMap.entrySet());

		System.out.println("java 8 - treemap sort by value - " + sortedset);

	}
}
