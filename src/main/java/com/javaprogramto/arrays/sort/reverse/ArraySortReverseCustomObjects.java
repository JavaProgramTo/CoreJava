package com.javaprogramto.arrays.sort.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortReverseCustomObjects {

	public static void main(String[] args) {

		Employee[] empArray = new Employee[5];
		empArray[0] = new Employee(500, "A", "2000");
		empArray[1] = new Employee(300, "B", "2001");
		empArray[2] = new Employee(200, "C", "2002");
		empArray[3] = new Employee(400, "D", "2003");
		empArray[4] = new Employee(100, "E", "2004");

		System.out.println("Employee array before sort ");
		for (Employee e : empArray) {
			System.out.println(e);
		}
		Arrays.sort(empArray, Collections.reverseOrder());

		System.out.println("\n" + "Employee array after sort");
		for (Employee e : empArray) {
			System.out.println(e);
		}

	}
}

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String dateOfJoin;

	public Employee(int id, String name, String dateOfJoin) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoin = dateOfJoin;
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

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoin=" + dateOfJoin + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.getId()).compareTo(o.getId());
	}

}