package com.javaprogramto.java8.arraylist.insert;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdateSetExample3 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);

		System.out.println("List1 values before update - " + list1);
		System.out.println("list1 size before - "+list1.size());

		list1.set(3, 333);

		System.out.println("List1 values after updating index 3 value with new value 333 - " + list1);
		System.out.println("list1 size after - "+list1.size());
	}
}
