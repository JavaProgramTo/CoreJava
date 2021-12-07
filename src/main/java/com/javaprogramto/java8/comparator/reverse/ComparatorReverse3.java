package com.javaprogramto.java8.comparator.reverse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorReverse3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "3", "2");

		System.out.println("Original list - " + list);

		List<String> result1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("result 1 " + result1);

		List<String> result2 = result1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("result 2 - " + result2);

	}
}
