package com.javaprogramto.java8.collectors.groupby.multiple;

public class Employee {

	private int id;
	private String name;
	private long salary;
	private GroupBy groupBy;

	public Employee(int id, String name, long salary, GroupBy groupBy) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.groupBy = groupBy;
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

	public GroupBy getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(GroupBy groupBy) {
		this.groupBy = groupBy;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", groupBy=" + groupBy + "]";
	}
}

class GroupBy {

	private String designation;
	private String gender;

	public GroupBy(String designation, String gender) {
		super();
		this.designation = designation;
		this.gender = gender;
	}

	@Override
	public int hashCode() {

		return this.designation.length() + this.gender.length();
	}

	@Override
	public boolean equals(Object obj) {

		GroupBy other = (GroupBy) obj;

		if (other.getDesignation().equals(this.designation) && other.getGender().equals(this.gender))
			return true;
		return false;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "GroupBy [designation=" + designation + ", gender=" + gender + "]";
	}

}