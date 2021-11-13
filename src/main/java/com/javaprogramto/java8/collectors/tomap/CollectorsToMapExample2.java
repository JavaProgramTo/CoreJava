package com.javaprogramto.java8.collectors.tomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.javaprogramto.java8.compare.Employee;

public class CollectorsToMapExample2 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "One", 20));
		employeeList.add(new Employee(2, "Two", 30));
		employeeList.add(new Employee(3, "Three", 40));
		employeeList.add(new Employee(4, "Four", 25));
		employeeList.add(new Employee(5, "Give", 35));
		
		Map<Integer, Employee> map = employeeList.stream()
				.collect(Collectors.toMap(Employee::getId, Function.identity()));
		
		
		System.out.println("List : "+employeeList);
		System.out.println("Map : "+map);

	}

}
