package com.javaprogramto.java8.comparator.lambda;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WithLambdasExample3 {

	public static void main(String[] args) {

		List<Engineer> engineers1 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("Before sorting");
		engineers1.forEach(System.out::println);

		// comparator with lambdas
		Comparator<Engineer> fulltimeComparator = (e1, e2) -> Boolean.valueOf(e1.isFullTime())
				.compareTo(Boolean.valueOf(e2.isFullTime()));

		Comparator<Engineer> idComparator = (e1, e2) -> Integer.valueOf(e1.getId()).compareTo(e2.getId());

		Comparator<Engineer> fullTimeAndIdComparator = fulltimeComparator.thenComparing(idComparator).reversed();

		// sorting with collections.sort()
		engineers1.sort(fullTimeAndIdComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers1.forEach(System.out::println);

	}

	private static List<Engineer> getEngineersList() {
		// creating the List of engineers
		List<Engineer> engineers = new LinkedList<>();

		// adding engineer objects
		engineers.add(new Engineer(100, "Jeo", 100000, false));
		engineers.add(new Engineer(103, "Sunny", 500000, true));
		engineers.add(new Engineer(104, "Zeon", 300000, false));
		engineers.add(new Engineer(105, "Neon", 400000, true));
		engineers.add(new Engineer(102, "Ammon", 200000, false));

		return engineers;
	}

}