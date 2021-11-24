package com.javaprogramto.java8.collectors.tolist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectToListExample4 {

	public static void main(String[] args) {
		Stream<String> vowels2 = Stream.of("A", "E", "I", "O", "U");

		List<Integer> list = vowels2.map(str -> (int) str.charAt(0)).filter(number -> number % 2 != 0)
				.collect(Collectors.toCollection(LinkedList::new));

		if (list instanceof LinkedList) {
			System.out.println("Returned list is a instacne of LinkedList");
		} else if (list instanceof ArrayList) {
			System.out.println("Returned list is a instacne of ArrayList");
		}
		System.out.println("stream collect to ArrayList output : " + list);

	}
}
