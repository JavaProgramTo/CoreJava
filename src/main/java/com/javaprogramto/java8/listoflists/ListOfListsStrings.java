package com.javaprogramto.java8.listoflists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListsStrings {

	public static void main(String[] args) {

		List<List<String>> listOfLists = new ArrayList<>();

		List<String> innerList1 = new ArrayList<>();

		innerList1.add("A");
		innerList1.add("B");
		innerList1.add("C");

		List<String> innerList2 = new ArrayList<>();

		innerList2.add("D");
		innerList2.add("E");
		innerList2.add("F");

		listOfLists.add(innerList1);
		listOfLists.add(innerList2);

		// System.out.println("List of lists - "+listOfLists);

		for (List<String> list : listOfLists) {

			for (String letter : list) {
				System.out.println(letter);
			}
		}

		listOfLists.forEach(
				(List<String> innerList) -> 
						innerList.forEach((String item) -> System.out.println(item))
				);
		

		List<String> strings = listOfLists.stream()
										.flatMap(list -> list.stream())
										.collect(Collectors.toList());
		System.out.println("flat map strings - "+strings);
	}
}
