package com.javaprogramto.java8.streams.filter.ifelse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreammultipleIfExample {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(10, 13, 15, 20, 24, 16, 17, 100);

		List<Integer> evenList = numbersList.stream()
						.filter(number -> number > 20)
						.filter(number -> number % 2 == 0)
						.collect(Collectors.toList());

		System.out.println("Even numbers list - " + evenList);
	}
}
