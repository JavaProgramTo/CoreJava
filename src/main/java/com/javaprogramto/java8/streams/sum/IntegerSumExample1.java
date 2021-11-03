package com.javaprogramto.java8.streams.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.javaprogramto.models.Employee;

public class IntegerSumExample1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// reduce() example
		int totalSum = numbers.stream().reduce(0, ArithmeticUtils::add);
		System.out.println("Sum of integers : " + totalSum);

		// summingInt() example
		int summingIntValue = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum of integers using summingInt : " + summingIntValue);

		// IntStream sum() example
		int intStreamSum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("IntStream sum : " + intStreamSum);

		Map<Double, Integer> map = new HashMap<>();
		map.put(1.0, 100);
		map.put(2.0, 200);
		map.put(3.0, 300);
		map.put(4.0, 400);

		int mapValuesSum = map.values().stream().reduce(0, Integer::sum);
		System.out.println("Map values sum : " + mapValuesSum);

		List<Employee> emps = Arrays.asList(new Employee(100, "A", 25), new Employee(200, "B", 35),
				new Employee(300, "C", 45));
		
		int sum = emps.stream().map(emp -> emp.getAge())
					  .reduce(0, (a, b) -> a + b);

		sum = emps.stream().map(emp -> emp.getAge())
				  .mapToInt(Integer::intValue)
				  .sum();
		
		sum = emps.stream().map(emp -> emp.getAge())
				  .collect(Collectors.summingInt(Integer::intValue));
		
		System.out.println("custom objects sum : "+sum);
	}

}

class ArithmeticUtils {

	public static int add(int number1, int number2) {
		return number1 + number2;
	}
}
