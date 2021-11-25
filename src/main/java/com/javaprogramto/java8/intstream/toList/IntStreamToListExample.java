package com.javaprogramto.java8.intstream.toList;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamToListExample {

	public static void main(String[] args) {

		IntStream evenIntStream = IntStream.iterate(0, i -> i + 2);

		Stream<Integer> stream = evenIntStream.limit(100).boxed();

		List<Integer> list = stream.collect(Collectors.toList());

		System.out.println("list size : " + list.size());

		IntStream evenIntStream2 = IntStream.iterate(0, i -> i + 2);
		
		Stream<Integer> stream2 = evenIntStream2.limit(100).boxed();

		List<Integer> linkedList = stream2.collect(Collectors.toCollection(LinkedList::new));

		System.out.println("linkedList size : " + linkedList.size());

	}
}
