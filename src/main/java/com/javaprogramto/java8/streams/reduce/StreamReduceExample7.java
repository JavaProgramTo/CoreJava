package com.javaprogramto.java8.streams.reduce;

import java.util.Arrays;
import java.util.List;

import com.javaprogramto.java8.compare.Employee;

public class StreamReduceExample7 {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(new Employee(100, "A", 20), new Employee(200, "B", 30),
				new Employee(300, "C", 40));

		Integer ageSum = empList.stream().map(emp -> emp.getAge()).reduce(new Employee(400, "new emp", 60).getAge(),
				(age1, age2) -> age1 + age2);

		System.out.println("age sum - " + ageSum);

	}

}
