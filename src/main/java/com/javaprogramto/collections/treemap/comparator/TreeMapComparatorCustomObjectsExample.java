package com.javaprogramto.collections.treemap.comparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorCustomObjectsExample {

	public static void main(String[] args) {

		Map<Customer, Integer> customerAgeMap = new TreeMap<>();

		customerAgeMap.put(new Customer(123, "D"), 30);
		customerAgeMap.put(new Customer(102, "B"), 70);
		customerAgeMap.put(new Customer(135, "A"), 40);
		customerAgeMap.put(new Customer(130, "C"), 50);

		System.out.println("treemap - " + customerAgeMap);
		
		

	}
}

class Customer {
	private int id;
	private String name;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
}
