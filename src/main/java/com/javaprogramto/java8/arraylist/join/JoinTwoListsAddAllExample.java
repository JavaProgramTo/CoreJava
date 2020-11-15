package com.javaprogramto.java8.arraylist.join;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoinTwoListsAddAllExample {

	public static void main(String[] args) {
		// Creating list 1

		List<String> list1 = new ArrayList<>();

		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");

		// creating list 2
		List<String> list2 = new ArrayList<>();

		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list2.add("nine");
		list2.add("ten");

		// creating list 3
		List<String> list3 = new ArrayList<>();

		list2.add("11");
		list2.add("12");

		System.out.println("List1 values : " + list1);
		System.out.println("List2 values : " + list2);

		// Joining list1 and list2 into a one list with both list values.

		List<String> joinedList = new ArrayList<>(list1);
		// joinedList.addAll(list1);
		joinedList.addAll(list2);

		// printing the merged list
		System.out.println("Joined list : " + joinedList);

		// using Double curly braces.
		List<String> joinedList2 = new ArrayList<String>() {
			{
				addAll(list1);
				addAll(list2);
			}
		};

		// printing the merged list
		System.out.println("Joined list : " + joinedList2);

		List<String> multipleListsJoin = new ArrayList<>();

		Collections.addAll(multipleListsJoin, list1.toArray(new String[0]));
		Collections.addAll(multipleListsJoin, list2.toArray(new String[0]));
		Collections.addAll(multipleListsJoin, list3.toArray(new String[0]));

		System.out.println("Joining multiple lists : "+multipleListsJoin);

	}

}
