package com.javaprogramto.java8.listoflists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListsIntegers {

	public static void main(String[] args) {

		List<List<Integer>> listOfLists = new ArrayList<>();

		List<Integer> innerList1 = new ArrayList<>();

		innerList1.add(1);
		innerList1.add(2);
		innerList1.add(3);

		List<Integer> innerList2 = new ArrayList<>();

		innerList2.add(4);
		innerList2.add(5);
		innerList2.add(6);

		listOfLists.add(innerList1);
		listOfLists.add(innerList2);

		// System.out.println("Integer List of lists - "+listOfLists);

		for (List<Integer> list : listOfLists) {

			for (Integer i : list) {
				System.out.println(i);
			}
		}

		listOfLists.forEach(
				(List<Integer> innerList) -> 
						innerList.forEach((Integer item) -> System.out.println(item)
							)
				);
		
		List<Integer> ints = listOfLists.stream()
										.flatMap(list -> list.stream())
										.collect(Collectors.toList());
		System.out.println("flat map ints - "+ints);

	}

}
