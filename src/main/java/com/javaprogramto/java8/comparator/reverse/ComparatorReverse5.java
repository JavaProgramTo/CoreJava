package com.javaprogramto.java8.comparator.reverse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorReverse5 {

	public static void main(String[] args) {

		List<Teacher> teachers = new ArrayList<>();

		teachers.add(new Teacher("Rajesh", "Science", 10));
		teachers.add(new Teacher("Mahesh", "Mathematics", 5));
		teachers.add(new Teacher("Suresh", "English", 10));
		teachers.add(new Teacher("Rakesh", "Science", 3));
		teachers.add(new Teacher("Ramesh", "Mathematics", 8));

		System.out.println("Original teachers list - ");
		teachers.forEach(t -> System.out.println(t.getName()));

		Comparator<Teacher> sortByName = (t1, t2) -> t1.getName().compareTo(t2.getName());

		List<Teacher> sortBynameList = teachers.stream().sorted(sortByName).collect(Collectors.toList());

		System.out.println("\nSorted by name ascending order");
		sortBynameList.forEach(t -> System.out.println(t.getName()));

		Comparator<Teacher> sortByNameReverse = sortByName.reversed();

		sortBynameList = teachers.stream().sorted(sortByNameReverse).collect(Collectors.toList());

		System.out.println("Sorted by name descending order ");
		sortBynameList.forEach(t -> System.out.println(t.getName()));
	}
}
