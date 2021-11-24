package com.javaprogramto.java8.collectors.tolist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectToListExample1 {

	public static void main(String[] args) {
		Stream<String> vowels = Stream.of("A", "E", "I", "O", "U");

		List<String> list = vowels.collect(Collectors.toList());

		System.out.println("stream collect to list output : " + list);
	}
}
