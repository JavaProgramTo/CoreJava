package com.javaprogramto.java8.arraylist.join;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class JoinTwoListsJava8Example {

	public static void main(String[] args) {
		// Creating list 1

		List<String> list1 = new ArrayList<>();

		list1.add("manog");
		list1.add("banana");

		// creating list 2
		List<String> list2 = new ArrayList<>();

		list2.add("apple");
		list2.add("orange");

		// way -1 Stream.concat() method.

		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 = list2.stream();

		List<String> joinedList = Stream.concat(stream1, stream2).collect(Collectors.toList());

		System.out.println("Joined list values : " + joinedList);

		// way 2 Stream.flatMap() method.

		List<String> joinedList2 = Stream.of(list1, list2).flatMap(list -> list.stream()).collect(Collectors.toList());

		System.out.println("Joined list values using flatMap() : " + joinedList2);
		
		// way 3 Stream.flatMap() method.
		List<String> joinedList3  = new ArrayList<>();
		Stream.of(list1, list2).forEach(joinedList3::addAll);

		System.out.println("Joined list values using forEach() : " + joinedList3);

	}

}
