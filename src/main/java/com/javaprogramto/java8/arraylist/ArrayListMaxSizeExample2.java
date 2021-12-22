package com.javaprogramto.java8.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaxSizeExample2 {

	public static void main(String[] args) {

		System.out.println("Integer.MAX_VALUE - " + Integer.MAX_VALUE);
		System.out.println("Math.pow(2, 31) - " + (int) Math.pow(2, 31));

		// default size is 10
		int maxValue = Integer.MAX_VALUE - 1;
		List<Integer> intList = new ArrayList<>(maxValue);
		
		for (int i = 0; i < maxValue; i++) {
			intList.add(i);
		}

		System.out.println("Int list size - " + intList.size());

	}

}
