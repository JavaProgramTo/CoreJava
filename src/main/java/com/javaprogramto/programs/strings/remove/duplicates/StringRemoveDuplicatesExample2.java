package com.javaprogramto.programs.strings.remove.duplicates;

import java.util.HashSet;
import java.util.Set;

public class StringRemoveDuplicatesExample2 {

	public static void main(String[] args) {

		String orignalString = "world world";

		StringBuilder builder = new StringBuilder();
		Set<Character> set = new HashSet<>();

		char[] chars = orignalString.toCharArray();

		for (char ch : chars) {

			if (set.add(ch)) {
				builder.append(ch);
			}
		}
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + builder.toString());

	}

}
