package com.javaprogramto.chars;

public class AddCharToStringExample2 {

	public static void main(String[] args) {

		// adding the char at the start of string
		String addingCharAtStart = 'A' + " hello";
		
		// adding multiple chars at the start of the string
		String addingCharsAtStart = 'A' + 'B'+ " hello";
		
		System.out.println("adding single char to the start of the string - "+addingCharAtStart);
		System.out.println("adding miltiple chars to the start of the string  - "+addingCharsAtStart);
	}
}
