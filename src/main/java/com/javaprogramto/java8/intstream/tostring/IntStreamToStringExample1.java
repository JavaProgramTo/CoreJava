package com.javaprogramto.java8.intstream.tostring;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamToStringExample1 {

	public static void main(String[] args) {

		IntStream nums = IntStream.of(10, 20, 30);

		Stream<String> stream = nums.mapToObj(i -> String.valueOf(i));

		// string without any separator
		String string1 = stream.collect(Collectors.joining());
		System.out.println("String 1 : " + string1);

		// string without any separator with - delimiter
		IntStream nums2 = IntStream.of(10, 20, 30);
		String string2 = nums2.mapToObj(i -> String.valueOf(i)).collect(Collectors.joining("-"));
		System.out.println("String 2 : " + string2);

		// string without any separator - with delimiter, prefix and suffix
		IntStream nums3 = IntStream.of(10, 20, 30);
		String string3 = nums3.mapToObj(i -> String.valueOf(i)).collect(Collectors.joining("-", "{", "}"));
		System.out.println("String 3 : " + string3);
	}
}
