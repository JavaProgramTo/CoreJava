package com.javaprogramto.java8.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverseOrderJava8 {

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

		// sorting the list in the ascending order
		Collections.sort(numbersList);

		// reversing the sorted list into descending order
		Collections.reverse(numbersList);

		// printing the final list after reverse order sorting. Original list only
		// sorted.
		System.out.println("After sorting : " + numbersList);

	}

}
