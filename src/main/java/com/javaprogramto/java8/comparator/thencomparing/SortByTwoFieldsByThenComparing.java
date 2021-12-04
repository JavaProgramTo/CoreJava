package com.javaprogramto.java8.comparator.thencomparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByTwoFieldsByThenComparing {

	public static void main(String[] args) {

		List<Author> authors = new ArrayList<>();

		authors.add(new Author(100, "Bakliwal", "R", "Shagun", 10));
		authors.add(new Author(101, "Bakliwal", "R", "Baalen", 10));
		authors.add(new Author(101, "Bakliwal", "P", "Bakliwal", 10));
		authors.add(new Author(101, "Ashish", "S", "Paradkar", 10));
		authors.add(new Author(101, "Ashish", "P", "Bakliwal", 10));
		authors.add(new Author(101, "Ashish", "S", "Ameen", 10));

		// first comparator - comparator by lamdba expression
		Comparator<Author> firstNameComparator = (a1, a2) -> a1.getFirstName().compareTo(a2.getFirstName());

		// second comparator - comparing() method by method reference
		Comparator<Author> middleNameComparator = Comparator.comparing(Author::getMiddleName);

		// thenComparing() method to merge 2 comparator
		Comparator<Author> firstMiddleNamesComparator = firstNameComparator.thenComparing(middleNameComparator);

		System.out.println("Before sorting by two fields");
		authors.forEach(a -> System.out.println(a));

		Collections.sort(authors, firstMiddleNamesComparator);

		System.out.println("after sorting merged comparator");
		authors.forEach(a -> System.out.println(a));

	}

}

class Author {
	int id;
	String firstName;
	String middleName;
	String lastName;
	int noOfBooks;

	public Author(int id, String firstName, String middleName, String lastName, int noOfBooks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.noOfBooks = noOfBooks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", noOfBooks=" + noOfBooks + "]";
	}

}