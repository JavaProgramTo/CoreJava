package com.javaprogramto.programs.conversions.string;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.base.Functions;
import com.google.common.collect.Lists;
import com.google.common.primitives.Chars;

public class StringtoStringArrayGuava {

	public static void main(String[] args) {

		// input string
		String input = "Using Guava";

		// spliting string into string array using split() method.
		String[] stringArray = Lists.transform(Chars.asList(input.toCharArray()), Functions.toStringFunction())
				.toArray(ArrayUtils.EMPTY_STRING_ARRAY);

		// printing the values of string array
		for (String string : stringArray) {
			System.out.println(string);
		}

		System.out.println(stringArray.length);
		System.out.println(input.length());

	}

}
