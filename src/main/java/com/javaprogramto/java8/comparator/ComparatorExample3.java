package com.javaprogramto.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample3 {

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

		Comparator<Teacher> subjectComparator = (t1, t2) -> t1.getSubject().compareTo(t2.getSubject());
		
		Collections.sort(teachers, subjectComparator);

		System.out.println("\nTeachers object before sorting");
		teachers.forEach(teacher -> System.out.println("Teacher name - " + teacher.getName() + ", subject - "
				+ teacher.getSubject() + ", exp - " + teacher.getExperience()));

	}

}
