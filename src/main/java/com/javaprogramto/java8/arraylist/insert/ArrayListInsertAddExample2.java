package com.javaprogramto.java8.arraylist.insert;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInsertAddExample2 {

	public static void main(String[] args) {

		List<String> list2 = new ArrayList<>();

		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		list2.add("six");

		System.out.println("List2 values before insertion - " + list2);
		System.out.println("list2 size before - "+list2.size());

		list2.add(3, "new four");

		System.out.println("List2 values after inserting the value 333 at index 3 - " + list2);
		System.out.println("list2 size after - "+list2.size());
	}
}
