package com.javaprogramto.collections.set.add;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAddExample {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();

		set.add(20);
		set.add(10);
		set.add(90);
		set.add(50);
		set.add(300);

		System.out.println("TreeSet values are sorted : " + set);
	}
}
