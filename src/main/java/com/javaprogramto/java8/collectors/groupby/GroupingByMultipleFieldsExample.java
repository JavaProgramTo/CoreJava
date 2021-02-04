package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleFieldsExample {

	public static void main(String[] args) {

		// Creating List and adding Employees values.
		List<Employee> employeesList = new ArrayList<>();

		employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
		employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
		employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
		employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
		employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
		employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
		employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));

		// Example 1
		// group by - multiple fields
		// Grouping by designation and Gender two properties and need to get the count.

		Map<String, Map<String, Long>> multipleFieldsMap = employeesList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDesignation, 
								Collectors.groupingBy(Employee::getGender, 
										Collectors.counting())));

		// printing the count based on the designation and gender.
		System.out.println("Group by on multiple properties" + multipleFieldsMap);
		
		// Example 2
		// group by - multiple fields
		// Grouping by designation and Gender two properties and need to get the count.

		Map<String, Map<String, List<Employee>>> multipleFieldsMapList = employeesList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDesignation, 
								Collectors.groupingBy(Employee::getGender)));

		// printing the count based on the designation and gender.
		System.out.println("Group by on multiple properties and Map key as List" + multipleFieldsMapList);

	}
}
