package com.javaprogramto.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamForEachCollect {

	public static void main(String[] args) {

		// creating a list
		List<String> list = new ArrayList<>();

		// adding values to list
		list.add("hello");
		list.add("world");
		list.add("welcome");
		list.add("to");
		list.add("javaprogramto.com");

		// list.stream().filter(value -> value.contains("c")).forEach(value -> value +
		// "-").collect();

		// stream filter() + map() + collect() example
		List<String> newList = list.stream().filter(value -> value.contains("c"))
									.map(value -> value + "-")
									.collect(Collectors.toList());
		
		//printing the list
		System.out.println("Original List : "+list);
		System.out.println("New List Values : ");
		
		// print using forEach on list.
		newList.forEach(value -> System.out.println(value));
		
		// iterating stream using forEach()
		System.out.println("\niterating stream using forEach()");
		list.stream().filter(value -> value.contains("c"))
				.map(value -> value + "-")
				.forEach(str -> System.out.println(str));
	}
}
