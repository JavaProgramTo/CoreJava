package com.javaprogramto.programs.strings.whitespaces;

import org.springframework.util.StringUtils;

public class StringRemoveWhiteSpacesExample3 {

	public static void main(String[] args) {

		System.out.println("Using spring framework api");

		// example 1 - trimAllWhitespace()
		String string1 = "hello madam";

		String output1 = StringUtils.trimAllWhitespace(string1);

		System.out.println("\nInput str 1 : " + string1);
		System.out.println("Output str 1 " + output1);

		// example 2 - trimAllWhitespace()
		String string2 = "	hello madam, welcome 	to the new house";

		String output2 = StringUtils.trimAllWhitespace(string2);

		System.out.println("\nInput str 2 : " + string2);
		System.out.println("Output str 2 " + output2);

	}

}
