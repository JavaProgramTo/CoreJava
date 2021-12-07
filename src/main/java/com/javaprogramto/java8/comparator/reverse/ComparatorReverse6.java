package com.javaprogramto.java8.comparator.reverse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorReverse6 {

	public static void main(String[] args) {

		List<Teacher2> Teacher2s = new ArrayList<>();

		Teacher2s.add(new Teacher2("Rajesh", "Science", 10));
		Teacher2s.add(new Teacher2("Mahesh", "Mathematics", 5));
		Teacher2s.add(new Teacher2("Suresh", "English", 10));
		Teacher2s.add(new Teacher2("Rakesh", "Science", 3));
		Teacher2s.add(new Teacher2("Ramesh", "Mathematics", 8));

		System.out.println("Original Teacher2s list - ");
		Teacher2s.forEach(t -> System.out.println(t.getSubject()));

		List<Teacher2> sortBynameList = Teacher2s.stream().sorted()
				.collect(Collectors.toList());

		System.out.println("\nSorted by subject ascending order");
		sortBynameList.forEach(t -> System.out.println(t.getSubject()));

		sortBynameList = Teacher2s.stream().sorted().collect(Collectors.toList());

		System.out.println("\nSorted by subject descending order ");
		sortBynameList.forEach(t -> System.out.println(t.getSubject()));
	}
}
