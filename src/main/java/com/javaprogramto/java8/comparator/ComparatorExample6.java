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

		
		// way 1 - comparator with method ref and comparing() and thenComparing() method.
		Comparator<Teacher> subjectExpComparator1 = Comparator.comparing(Teacher::getSubject)
				.thenComparing(Teacher::getExperience);

		List<Teacher> sortedList1 = teachers.stream().sorted(subjectExpComparator1).collect(Collectors.toList());

		// way 2 - lambda with comparator 
		Comparator<Teacher> subjectExpComparator2 = (t1, t2) -> {

			int subjectCompare = t1.getSubject().compareTo(t2.getSubject());
			int expCompare = Integer.valueOf(t1.getExperience()).compareTo(t2.getExperience());
			return subjectCompare == 0 ? expCompare : subjectCompare;
		};

		List<Teacher> sortedList2 = teachers.stream().sorted(subjectExpComparator1).collect(Collectors.toList());

		// way 3 - with anonymous comparator
		Comparator<Teacher> subjectExpComparator3 = new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {
				int subjectCompare = t1.getSubject().compareTo(t2.getSubject());
				int expCompare = Integer.valueOf(t1.getExperience()).compareTo(t2.getExperience());
				return subjectCompare == 0 ? expCompare : subjectCompare;
			}
		};

		List<Teacher> sortedList3 = teachers.stream().sorted(subjectExpComparator3).collect(Collectors.toList());

		// using collections.sort
		
		Collections.sort(teachers, subjectExpComparator1);
		Collections.sort(teachers, subjectExpComparator2);
		Collections.sort(teachers, subjectExpComparator3);

		System.out.println("\nTeachers object before sorting");
		teachers.forEach(teacher -> System.out.println("Teacher name - " + teacher.getName() + ", subject - "
				+ teacher.getSubject() + ", exp - " + teacher.getExperience()));

	}

}