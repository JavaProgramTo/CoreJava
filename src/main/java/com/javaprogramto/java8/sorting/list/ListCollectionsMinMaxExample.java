package com.javaprogramto.java8.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollectionsMinMaxExample {
	public static void main(String[] args) {

		// creating a list to store the integer values
		List<Integer> numbers = new ArrayList<>();

		// adding integer values
		numbers.add(23);
		numbers.add(45);
		numbers.add(76);
		numbers.add(9);
		numbers.add(10);

		// getting the min value using min() method 
		int min = Collections.min(numbers);

		// getting max value using max() method
		int max = Collections.max(numbers);

		System.out.println("List Collections api - min : " + min + ", max : " + max);
	}
}
