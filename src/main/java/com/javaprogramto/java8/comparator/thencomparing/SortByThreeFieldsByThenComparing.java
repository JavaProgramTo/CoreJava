package com.javaprogramto.java8.comparator.thencomparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByThreeFieldsByThenComparing {

	public static void main(String[] args) {

		List<Author> authors = new ArrayList<>();

		authors.add(new Author(100, "Bakliwal", "R", "Shagun", 10));
		authors.add(new Author(101, "Bakliwal", "R", "Baalen", 10));
		authors.add(new Author(101, "Bakliwal", "P", "Bakliwal", 10));
		authors.add(new Author(101, "Ashish", "S", "Paradkar", 10));
		authors.add(new Author(101, "Ashish", "P", "Bakliwal", 10));
		authors.add(new Author(101, "Ashish", "S", "Ameen", 10));

		// first comparator - comparing() method by method reference
		Comparator<Author> firstNameComparator = Comparator.comparing(Author::getFirstName);

		// second comparator - comparing() method by method reference
		Comparator<Author> middleNameComparator = Comparator.comparing(Author::getMiddleName);

		// second comparator - comparing() method by method reference
		Comparator<Author> lastNameComparator = Comparator.comparing(Author::getLastName);

		// thenComparing() method to merge 3 comparators in chain.
		Comparator<Author> fullNamesComparator = firstNameComparator.thenComparing(middleNameComparator)
				.thenComparing(lastNameComparator);

		System.out.println("Before sorting by 3 fields");
		authors.forEach(a -> System.out.println(a));

		Collections.sort(authors, fullNamesComparator);
		authors.sort(fullNamesComparator);

		System.out.println("after sorting merged comparator");
		authors.forEach(a -> System.out.println(a));
	}
}