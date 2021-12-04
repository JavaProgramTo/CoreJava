package com.javaprogramto.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

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

		Collections.sort(teachers, new SubjectComparator());

		System.out.println("\nTeachers object after sorting");
		teachers.forEach(teacher -> System.out.println("Teacher name - " + teacher.getName() + ", subject - "
				+ teacher.getSubject() + ", exp - " + teacher.getExperience()));

	}

}

// Custom comparator to sort Teacher objects by subject they teach
class SubjectComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {

		return t1.getSubject().compareTo(t2.getSubject());
	}

}

class Teacher {

	String name;
	String subject;
	int experience;

	public Teacher(String name, String subject, int experience) {
		super();
		this.name = name;
		this.subject = subject;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}