package com.javaprogramto.arrays.comparator;

import java.util.Arrays;
import java.util.Comparator;

import com.javaprogramto.models.Employee;

public class ArraysSortCustomComparatorExample {

	public static void main(String[] args) {

		Employee[] empArray = new Employee[5];

		empArray[0] = new Employee(100, "Malik Mona", 30);
		empArray[1] = new Employee(105, "A Z", 35);
		empArray[2] = new Employee(102, "B Z", 33);
		empArray[3] = new Employee(103, "C Z", 31);
		empArray[4] = new Employee(104, "D Z", 34);

		System.out.println("emp array before sort - ");
		Arrays.stream(empArray).forEach(emp -> System.out.println(emp));

		Comparator<Employee> sortById = Comparator.comparing(Employee::getId);

		Arrays.sort(empArray, sortById);

		System.out.println("\nemp array after sort - ");
		Arrays.stream(empArray).forEach(emp -> System.out.println(emp));
	}
}
