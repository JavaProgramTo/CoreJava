package com.javaprogramto.java8.streams.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctByCustomPropertyExample {

	// predicate to filter the duplicates by the given key extractor.
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
		return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

	public static void main(String[] args) {

		// creating customer objects with repeated id's 100, 101
		Customer customer1 = new Customer(100, "Jhon", 675000000l);
		Customer customer2 = new Customer(101, "Peter", 675000001l);
		Customer customer3 = new Customer(100, "Paul", 675000002l);
		Customer customer4 = new Customer(102, "Noel", 675000003l);
		Customer customer5 = new Customer(101, "Nup", 675000004l);

		// created a list to store the customer objects
		List<Customer> customers = new ArrayList<>();

		// adding customer objects
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);

		// removing the duplicates
		List<Customer> distinctElements = customers.stream().filter(distinctByKey(cust -> cust.getId()))
				.collect(Collectors.toList());

		System.out.println("customers size : " + customers.size());
		System.out.println("Distinct customers size : " + distinctElements.size());

	}

}
