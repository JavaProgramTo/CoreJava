package com.javaprogramto.java8.streams.filter.ifelse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IfElseExample {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(10, 13, 15, 20, 24, 16, 17, 100);

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		for (int index = 0; index < numbersList.size(); index++) {
			if (numbersList.get(index) % 2 == 0) {
				evenList.add(numbersList.get(index));
			} else {
				oddList.add(numbersList.get(index));
			}
		}

		System.out.println("Even numbers list - " + evenList);
		System.out.println("Odd numbers list - " + oddList);
	}

}
