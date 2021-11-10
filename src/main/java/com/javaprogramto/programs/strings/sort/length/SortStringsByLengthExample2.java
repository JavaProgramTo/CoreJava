package com.javaprogramto.programs.strings.sort.length;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLengthExample2 {

	public static void main(String[] args) {

		String[] words = { "hello", "how", "are", "u", "doing" };
		System.out.println("string array before sorting : " + Arrays.toString(words));

		sortArrayByLengthUsingComparator(words, Sort.DESC);

		System.out.println("string array after sorting : " + Arrays.toString(words));

	}

	public static void sortArrayByLengthUsingComparator(String[] strs, Sort direction) {
		if (direction.equals(Sort.ASC)) {
			Arrays.sort(strs, Comparator.comparingInt(String::length));
		} else {
			Arrays.sort(strs, Comparator.comparingInt(String::length).reversed());
		}
	}

	public enum Sort {
		ASC, DESC
	}
}
