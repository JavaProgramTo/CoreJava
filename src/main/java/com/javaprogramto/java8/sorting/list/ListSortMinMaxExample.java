package com.javaprogramto.java8.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortMinMaxExample {

	public static void main(String[] args) {

		// creating a list to store the integer values
		List<Integer> numbers = new ArrayList<>();

		// adding integer values
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);
		numbers.add(10);
		numbers.add(20);

		// sorting List using collections.sort()
		Collections.sort(numbers);

		// getting the min value
		int min = numbers.get(0);

		// getting max value
		int max = numbers.get(numbers.size() - 1);

		System.out.println("List sorting - min : " + min + ", max : " + max);

	}

}
