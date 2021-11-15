package com.javaprogramto.exception.IllegalArgumentException;

import java.util.ArrayList;
import java.util.List;

import com.javaprogramto.java8.compare.Employee;

public class IllegalArgumentExceptionExample4 {

	public static void main(String[] args) {

		// Example 1
		List<String> list = new ArrayList<>(10);
		list.add("a");
		list.add("b");
		list.add("c");

		// Example 2
		List<String> stringsList = new ArrayList<>();
		stringsList.add("a");
		stringsList.add("b");
		stringsList.add("c");

		stringsList.stream().skip(2);

		// Example 3
		Employee employeeRequest = new Employee(222, "Ram", 20);

		if (employeeRequest.getAge() < 18 || employeeRequest.getAge() > 65) {
			throw new IllegalArgumentException("Invalid age for the emp req");
		}
		
		System.out.println("No errors");

	}
}
