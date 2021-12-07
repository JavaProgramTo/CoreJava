package com.javaprogramto.java8.comparator.reverse;

public class Teacher2 implements Comparable<Teacher2>{

	String name;
	String subject;
	int experience;

	public Teacher2(String name, String subject, int experience) {
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

	@Override
	public int compareTo(Teacher2 o) {
		// TODO Auto-generated method stub
		return this.getSubject().compareTo(o.getSubject());
	}
}