package com.javaprogramto.programs.strings.remove.duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringRemoveDuplicatesExample3 {

	public static void main(String[] args) {

		String orignalString = "world world";

		StringBuilder builder = new StringBuilder();
		Set<Character> set = new HashSet<>();

		String output = Arrays.asList(orignalString.split("")).stream().distinct().collect(Collectors.joining());

		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + output);

	}

}
