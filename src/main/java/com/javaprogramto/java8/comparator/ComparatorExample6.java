package com.javaprogramto.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample6 {

	public static void main(String[] args) {

		List<Teacher> teachers = new ArrayList<>();

		teachers.add(new Teacher("Rajesh", "Science", 10));
		teachers.add(new Teacher("Mahesh", "Mathematics", 5));
		teachers.add(new Teacher("Suresh", "English", 10));
		teachers.add(new Teacher("Rakesh", "Science", 3));
		teachers.add(new Teacher("Ramesh", "Mathematics", 8));

		System.out.println("Teachers object before sorting");
		teachers.forEach(teacher -> System.out.println("Teacher name - " + teacher.getName() + ", subject - "
				+ teacher.getSubject() + ", exp - " + teacher.getExperience()));

		// using streams.sort
		Comparator<Teacher> subjectExpComparator1 = Comparator.comparing(Teacher::getSubject)
				.thenComparing(Teacher::getExperience);

		List<Teacher> sortedList1 = teachers.stream().sorted(subjectExpComparator1).collect(Collectors.toList());

		Comparator<Teacher> subjectComparator2 = (t1, t2) -> {
			
			int subjectCompare = t1.getSubject().compareTo(t2.getSubject());
			int expCompare = Integer.valueof(t1.getExperience()).compareTo(t2.getExperience());
			return t1.getSubject().compareTo(t2.getSubject());
		};

		List<Teacher> sortedList2 = teachers.stream().sorted(subjectComparator2).collect(Collectors.toList());

		// using collections.sort

		System.out.println("\nTeachers object before sorting");
		teachers.forEach(teacher -> System.out.println("Teacher name - " + teacher.getName() + ", subject - "
				+ teacher.getSubject() + ", exp - " + teacher.getExperience()));

	}

}