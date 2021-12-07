package com.javaprogramto.java8.comparator.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorReverse {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "3", "2");

		System.out.println("Original list - " + list);
		Collections.reverse(list);
		System.out.println("Reversed list - " + list);

	}
}
