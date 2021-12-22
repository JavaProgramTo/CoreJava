package com.javaprogramto.java8.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaxSizeExample {

	public static void main(String[] args) {

		// default size is 10
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}

		System.out.println("Int list size (default) - " + intList.size());

	}

}
