package com.javaprogramto.java8.collectors.tolist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectToListExample3 {

	public static void main(String[] args) {
		Stream<String> vowels2 = Stream.of("A", "E", "I", "O", "U");

		List<String> list = vowels2.filter(str -> !str.equals("E") && !str.equals("O")).collect(Collectors.toList());

		if(list instanceof LinkedList) {
			System.out.println("Returned list is a instacne of LinkedList");
		} else if(list instanceof ArrayList) {
			System.out.println("Returned list is a instacne of ArrayList");
		}  
		System.out.println("stream collect to ArrayList output : " + list);

	}
}
