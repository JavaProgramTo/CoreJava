package com.javaprogramto.java8.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListReverseOrder1 {

	public static void main(String[] args) {

		// Creating ArrayList
		List<Integer> numbersList = new ArrayList<>();

		// Adding values to List
		numbersList.add(150);
		numbersList.add(50);
		numbersList.add(250);
		numbersList.add(500);
		numbersList.add(350);

		// printing before sorting
		System.out.println("Before sorting : " + numbersList);

		// Getting the descending order comparator
		Comparator<Integer> reverseComparator = Collections.reverseOrder();

		// Sorting with the reverse comparator with sort() method.
		// sort() method internally uses this comparator to sort in the descending order
		Collections.sort(numbersList, reverseComparator);

		// printing the final list after reverse order sorting. Original list only
		// sorted.
		System.out.println("After sorting : " + numbersList);
	}
}
