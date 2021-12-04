package com.javaprogramto.java8.comparator.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WithLambdasExample {

	public static void main(String[] args) {

		List<Engineer> engineers1 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("Before sorting");
		engineers1.forEach(System.out::println);

		// comparator with lambdas
		Comparator<Engineer> idComparator = (e1, e2) -> Integer.valueOf(e1.getId()).compareTo(e2.getId());

		// sorting with collections.sort()
		engineers1.sort(idComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers1.forEach(System.out::println);

		// sort engineers by name

		List<Engineer> engineers2 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("Before sorting");
		engineers2.forEach(System.out::println);

		// comparator in java 8 with lambdas
		Comparator<Engineer> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

		// sorting with list.sort()
		engineers2.sort(nameComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers2.forEach(System.out::println);

		// sort engineers by salary

		List<Engineer> engineers3 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("\nEngieer Sort by Salary");
		System.out.println("\nBefore sorting");
		engineers3.forEach(System.out::println);

		// comparator before java 8 and without lambds
		Comparator<Engineer> salaryComparator = (e1, e2) -> Long.valueOf(e1.getSalary()).compareTo(e2.getSalary());

		// sorting with collections.sort()
		engineers3.sort(salaryComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers3.forEach(System.out::println);

		// sort engineers by fulltime

		List<Engineer> engineers4 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("\nEngieer Sort by fulltime");
		System.out.println("\nBefore sorting");
		engineers4.forEach(System.out::println);

		// comparator in java 8 with lambdas
		Comparator<Engineer> fulltimeComparator = (e1, e2) -> Boolean.valueOf(e1.isFullTime())
				.compareTo(Boolean.valueOf(e2.isFullTime()));

		// sorting with list.sort()
		engineers4.sort(fulltimeComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers4.forEach(System.out::println);

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