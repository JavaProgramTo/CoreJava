package com.javaprogramto.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample2 {

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

		Comparator<Teacher> subjectComparator = Comparator.comparing(Teacher::getSubject);

		Collections.sort(teachers, subjectComparator);

		System.out.println("\nTeachers object before sorting");
		teachers.forEach(teacher -> System.out.println("Teacher name - " + teacher.getName() + ", subject - "
				+ teacher.getSubject() + ", exp - " + teacher.getExperience()));

	}

}

// Custom comparator to sort Teacher objects by subject they teach and their experience level
class SubjectExperienceComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {

		int name = t1.getSubject().compareTo(t2.getSubject());

		int exp = Integer.valueOf(t1.getExperience()).compareTo(t2.getExperience());

		return name == 0 ? exp : name;
	}

}
