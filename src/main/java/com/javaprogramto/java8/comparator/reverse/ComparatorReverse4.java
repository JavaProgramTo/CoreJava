package com.javaprogramto.java8.comparator.reverse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorReverse4 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("100", "3", "20");

		System.out.println("Original list - " + list);

		Comparator<String> sortByLength = Comparator.comparing(String::length);

		List<String> sortedList = list.stream().sorted(sortByLength).collect(Collectors.toList());

		System.out.println("Sorted by length ascending order - " + sortedList);

		Comparator<String> sortByLengthReverse = sortByLength.reversed();

		sortedList = list.stream().sorted(sortByLengthReverse).collect(Collectors.toList());

		System.out.println("Sorted by length descending order - " + sortedList);
	}
}
