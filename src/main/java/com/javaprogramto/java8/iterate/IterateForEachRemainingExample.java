package com.javaprogramto.java8.iterate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class IterateForEachRemainingExample {

	public static void main(String[] args) {

		// inline consumer
		System.out.println("Inline consumer - ");
		List<String> strings = Arrays.asList("A", "B", "C", "D");

		Iterator<String> it = strings.iterator();

		it.forEachRemaining(value -> System.out.println(value));

		// with separate consumer
		Set<Integer> values = new HashSet<>();

		values.add(100);
		values.add(200);
		values.add(300);
		values.add(400);
		
		System.out.println("With custom consumer - ");
		
		Consumer<Integer> consumer = (number) -> System.out.println(number - 1);

		Iterator<Integer> iterator = values.iterator();
		iterator.forEachRemaining(consumer);
	}
}
