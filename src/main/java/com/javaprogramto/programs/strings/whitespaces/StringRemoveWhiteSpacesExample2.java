package com.javaprogramto.programs.strings.whitespaces;

import org.apache.commons.lang3.StringUtils;

public class StringRemoveWhiteSpacesExample2 {

	public static void main(String[] args) {

		System.out.println("Using apache commons lang api");

		// example 1
		String string1 = "hello madam";

		String output1 = StringUtils.deleteWhitespace(string1);

		System.out.println("\nInput str 1 : " + string1);
		System.out.println("Output str 1 " + output1);

		// example 2
		String string2 = "	hello madam, welcome 	to the new house";

		String output2 = StringUtils.deleteWhitespace(string2);

		System.out.println("\nInput str 2 : " + string2);
		System.out.println("Output str 2 " + output2);

	}

}
