package com.javaprogramto.collections.set.add;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddExample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		boolean isAdded = set.add(10);
		System.out.println("Is 10 added? " + isAdded);

		isAdded = set.add(10);
		System.out.println("Is 10 added again? " + isAdded);
		
		isAdded = set.add(20);
		System.out.println("Is 20 added? " + isAdded);
		
		System.out.println("Set values : "+set);

	}

}
