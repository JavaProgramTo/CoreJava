package com.javaprogramto.java8.comparator.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousComparatorArrayExample {

	public static void main(String[] args) {

		String[] stringArray = new String[5];

		stringArray[0] = "abc";
		stringArray[1] = "mno";
		stringArray[2] = "def";
		stringArray[3] = "xyz";
		stringArray[4] = "ghi";

		System.out.println("Array before sorting - " + stringArray);

		Arrays.sort(stringArray, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {

				String str1 = (String) o1;
				String str2 = (String) o2;
				return str1.compareTo(str2);
			}

		});

		System.out.println("Array after sorting with anonymous comparator - " + stringArray);

	}

}
