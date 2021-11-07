package com.javaprogramto.programs.strings.whitespaces;

public class StringRemoveWhiteSpacesExample {

	public static void main(String[] args) {
		String regex = "\\s";
		String replacementString = "";

		// example 1
		String string1 = "hello welcome to the new place \n how are you feeling?";

		String output1 = string1.replaceAll(regex, replacementString);

		System.out.println("Input str 1 : " + string1);
		System.out.println("Output str 1 : " + output1);

		// example 2
		String string2 = "	this is tab 	based string 	";

		String output2 = string2.replaceAll(regex, replacementString);

		System.out.println("Input str 2 : " + string2);
		System.out.println("Output str 2 : " + output2);

	}

}
