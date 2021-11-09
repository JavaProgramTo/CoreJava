package com.javaprogramto.programs.strings.remove.duplicates;

public class StringRemoveDuplicatesExample1 {

	public static void main(String[] args) {

		String orignalString = "world world";

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < orignalString.length(); i++) {

			if (builder.indexOf(String.valueOf(orignalString.charAt(i))) == -1) {

				builder.append(orignalString.charAt(i));

			}
		}

		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + builder.toString());

	}

}
