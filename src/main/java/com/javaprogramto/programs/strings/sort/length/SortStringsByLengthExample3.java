package com.javaprogramto.programs.strings.sort.length;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLengthExample3 {

	public static void main(String[] args) {

		String[] words = { "hello", "how", "are", "u", "doing" };
		System.out.println("string array before sorting : " + Arrays.toString(words));

		String[] sortedArrayByLength = sortArrayByLengthUsingSorted(words, Sort.DESC);

		System.out.println("original array after sorting : " + Arrays.toString(words));
		System.out.println("new string array after sorting : " + Arrays.toString(sortedArrayByLength));

	}

	public static String[] sortArrayByLengthUsingSorted(String[] strs, Sort direction) {
		if (direction.equals(Sort.ASC)) {
			return Arrays.stream(strs)
					.sorted(Comparator.comparingInt(String::length))
					.toArray(String[]::new);
		} else {
			return Arrays.stream(strs)
					.sorted(Comparator.comparingInt(String::length)
					.reversed())
					.toArray(String[]::new);
		}
	}

	public enum Sort {
		ASC, DESC
	}
}
