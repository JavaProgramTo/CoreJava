package com.javaprogramto.java8.streams.filter.ifelse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8StreamForEachExample {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(10, 13, 15, 20, 24, 16, 17, 100);

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		numbersList.stream().forEach(number -> {
			if (number % 2 == 0) {
				evenList.add(number);
			} else {
				oddList.add(number);
			}

		});

		System.out.println("Even numbers list - " + evenList);
		System.out.println("Odd numbers list - " + oddList);
	}
}
