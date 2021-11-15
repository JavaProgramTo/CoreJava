package com.javaprogramto.exception.IllegalArgumentException;

import com.javaprogramto.java8.compare.Employee;

public class IllegalArgumentExceptionExample3 {

	public static void main(String[] args) {

		// Example 3
		Employee employeeRequest = new Employee(222, "Ram", 17);

		if (employeeRequest.getAge() < 18 || employeeRequest.getAge() > 65) {
			throw new IllegalArgumentException("Invalid age for the emp req");
		}

	}
}
