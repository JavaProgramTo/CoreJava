package com.javaprogramto.java8.comparator.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WIthoutLambdasExample {

	public static void main(String[] args) {

		List<Engineer> engineers1 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("Before sorting");
		engineers1.forEach(System.out::println);

		// comparator before java 8 and without lambds
		Comparator<Engineer> idComparator = new Comparator<Engineer>() {

			@Override
			public int compare(Engineer e1, Engineer e2) {

				return Integer.valueOf(e1.getId()).compareTo(e2.getId());
			}
		};

		// sorting with collections.sort()
		Collections.sort(engineers1, idComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers1.forEach(System.out::println);

		// sort engineers by name

		List<Engineer> engineers2 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("Before sorting");
		engineers2.forEach(System.out::println);

		// comparator before java 8 and without lambds
		Comparator<Engineer> nameComparator = new Comparator<Engineer>() {

			@Override
			public int compare(Engineer e1, Engineer e2) {

				return e1.getName().compareTo(e2.getName());
			}
		};

		// sorting with collections.sort()
		Collections.sort(engineers2, nameComparator);

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
		Comparator<Engineer> salaryComparator = new Comparator<Engineer>() {

			@Override
			public int compare(Engineer e1, Engineer e2) {

				return Long.valueOf(e1.getSalary()).compareTo(e2.getSalary());
			}
		};

		// sorting with collections.sort()
		Collections.sort(engineers3, salaryComparator);

		// printing engineer objects sorted by id
		System.out.println("\nAfter sorting");
		engineers3.forEach(System.out::println);

		// sort engineers by full time

		List<Engineer> engineers4 = getEngineersList();

		// printing engineer objects sorted by id
		System.out.println("\nEngieer Sort by fulltime");
		System.out.println("\nBefore sorting");
		engineers4.forEach(System.out::println);

		// comparator before java 8 and without lambds
		Comparator<Engineer> fulltimeComparator = new Comparator<Engineer>() {

			@Override
			public int compare(Engineer e1, Engineer e2) {

				return Boolean.valueOf(e1.isFullTime()).compareTo(Boolean.valueOf(e2.isFullTime()));
			}
		};

		// sorting with collections.sort()
		Collections.sort(engineers4, fulltimeComparator);

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

class Engineer {

	private int id;
	private String name;
	private long salary;
	private boolean fullTime;

	public Engineer(int id, String name, long salary, boolean fullTime) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.fullTime = fullTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public boolean isFullTime() {
		return fullTime;
	}

	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

	@Override
	public String toString() {
		return "Engineer [id=" + id + ", name=" + name + ", salary=" + salary + ", fullTime=" + fullTime + "]";
	}
}