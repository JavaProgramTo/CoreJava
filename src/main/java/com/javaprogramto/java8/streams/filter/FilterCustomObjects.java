package com.javaprogramto.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.javaprogramto.java8.compare.Employee;

public class FilterCustomObjects {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Ram baba", 50);
		Employee e2 = new Employee(101, "Tricky joy", 25);
		Employee e3 = new Employee(102, "Johon perth", 45);
		Employee e4 = new Employee(103, "abran parande", 21);
		Employee e5 = new Employee(104, "naha ama", 59);

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5);

		System.out.println("Emp list size  : " + emps.size());

		List<Employee> filteredList = emps.stream().filter(emp -> emp.getAge() < 35).collect(Collectors.toList());

		System.out.println("Emp list size after filter() : " + filteredList.size());

		// way 1
		List<Employee> multipleCriteriaList = emps.stream()
				.filter(emp -> emp.getAge() > 40 && emp.getName().contains("a")).collect(Collectors.toList());
		System.out.println("Multiple fields criteria: way 1 - " + multipleCriteriaList.size());

		// way 2
		List<Employee> multipleCriteriaList1 = emps.stream().filter(emp -> emp.getAge() > 40)
				.filter(emp -> emp.getName().contains("a")).collect(Collectors.toList());
		System.out.println("Multiple fields criteria: way 2 - " + multipleCriteriaList1.size());

	}

}
