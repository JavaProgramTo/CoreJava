package com.javaprogramto.java8.iterate;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SplitIteratorForEachRemainingExample {

	public static void main(String[] args) {

		Set<Integer> values = new HashSet<>();

		values.add(100);
		values.add(200);
		values.add(300);
		values.add(400);

		Spliterator<Integer> splitIterator = values.stream().spliterator();

		Consumer<Integer> consumer = (number) -> System.out.println(number - 1);

		splitIterator.forEachRemaining(consumer);
	}
}
