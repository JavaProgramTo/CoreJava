package com.javaprogramto.collections.set.add;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetAddExample {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		boolean isAdded = set.add(10);
		System.out.println("Is 10 added? " + isAdded);

		isAdded = set.add(10);
		System.out.println("Is 10 added again? " + isAdded);

		isAdded = set.add(20);
		isAdded = set.add(30);
		isAdded = set.add(40);

		System.out.println("LinkedHashSet values : " + set);

	}

}
