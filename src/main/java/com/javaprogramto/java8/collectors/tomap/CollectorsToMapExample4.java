package com.javaprogramto.java8.collectors.tomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.javaprogramto.java8.compare.Employee;

public class CollectorsToMapExample4 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "One", 20));
		employeeList.add(new Employee(2, "Two", 30));
		employeeList.add(new Employee(3, "Three", 40));
		employeeList.add(new Employee(4, "Four", 25));
		employeeList.add(new Employee(5, "Give", 35));
		employeeList.add(new Employee(5, "Giver", 36));

		// TreeMap example
		// converting duplicate keys into the TreeMap
		Map<Integer, Employee> treeMap = employeeList.stream().collect(
				Collectors.toMap(Employee::getId, Function.identity(), (oldVal, newVal) -> newVal, TreeMap::new));

		System.out.println("ArrayList : " + employeeList);
		System.out.println("TreeMap : " + treeMap);

		// ConcurrentHashMap example
		// converting duplicate keys into the ConcurrentHashMap
		Map<Integer, Employee> concurrentHashMap = employeeList.stream().collect(Collectors.toMap(Employee::getId,
				Function.identity(), (oldVal, newVal) -> newVal, ConcurrentHashMap::new));

		System.out.println("ArrayList : " + employeeList);
		System.out.println("ConcurrentHashMap : " + concurrentHashMap);

	}

}
