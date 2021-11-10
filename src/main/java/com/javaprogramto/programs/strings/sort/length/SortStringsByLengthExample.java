package com.javaprogramto.programs.strings.sort.length;

import java.util.Arrays;

public class SortStringsByLengthExample {

	public static void main(String[] args) {

		String[] words = { "hello", "how", "are", "u", "doing" };
		System.out.println("string array before sorting : "+Arrays.toString(words));
		
		
		sortArrayByLength(words, Sort.ASC);
		
		System.out.println("string array after sorting : "+Arrays.toString(words));

	}

	public static void sortArrayByLength(String[] strs, Sort direction) {
		if (direction.equals(Sort.ASC)) {
			Arrays.sort(strs, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		} else {
			Arrays.sort(strs, (String s1, String s2) -> (-1) * Integer.compare(s1.length(), s2.length()));
		}
	}

	public enum Sort {
		ASC, DESC
	}
}
