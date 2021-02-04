package com.javaprogramto.java8.collectors.groupby.multiple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleFieldsExample {

	public static void main(String[] args) {

		// Creating List and adding Employees values.
		List<Employee> employeesList = new ArrayList<>();

		employeesList.add(new Employee(101, "Glady", 25_00_000, new GroupBy("Manager", "Male")));
		
		employeesList.add(new Employee(102, "Vlad", 15_00_000, new GroupBy("Software Engineer", "Female")));
		employeesList.add(new Employee(103, "Shine", 20_00_000, new GroupBy("Lead Engineer", "Female")));
		employeesList.add(new Employee(104, "Nike", 25_00_000, new GroupBy("Manager", "Female")));
		employeesList.add(new Employee(105, "Slagan", 15_00_000, new GroupBy("Software Engineer", "Male")));
		employeesList.add(new Employee(106, "Murekan", 15_00_000, new GroupBy("Software Engineer", "Male")));
		employeesList.add(new Employee(107, "Gagy", 15_00_000, new GroupBy("Software Engineer", "Male")));

		// Example 1
		// group by - multiple fields
		// Grouping by designation and Gender two properties and need to get the count.

		Map<GroupBy, Long> multipleFieldsMap = employeesList.stream()
				.collect(Collectors.groupingBy(Employee::getGroupBy, Collectors.counting()));

		// printing the count based on the designation and gender.
		System.out.println("Group by on multiple properties" + multipleFieldsMap);
	}
}
