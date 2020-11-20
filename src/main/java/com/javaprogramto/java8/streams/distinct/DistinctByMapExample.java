package com.javaprogramto.java8.streams.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctByMapExample {

	public static void main(String[] args) {

		// creating customer objects with repeated id's 100, 101
		Customer customer1 = new Customer(100, "Jhon", 675000000l);
		Customer customer2 = new Customer(101, "Peter", 675000001l);
		Customer customer3 = new Customer(100, "Paul", 675000002l);
		Customer customer4 = new Customer(102, "Noel", 675000003l);
		Customer customer5 = new Customer(101, "Nup", 675000004l);

		// created a list to store the customer objects
		List<Customer> customers = Arrays.asList(customer1, customer2, customer3, customer4, customer5);

		// removing the duplicates and collecting into map id as key, customer as value
		Map<Integer, Customer> mapIdCustomer = customers.stream()
				.collect(Collectors.toMap(Customer::getId, c -> c, (c1, c2) -> c1));

		System.out.println("Final map after eliminating the duplicates - "+mapIdCustomer);

	}

}
