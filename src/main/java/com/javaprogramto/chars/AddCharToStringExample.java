package com.javaprogramto.chars;

public class AddCharToStringExample {

	public static void main(String[] args) {

		// adding the char at the end of string
		String addingChar = "hello" + 'A';
		
		// adding multiple chars at the end of the string
		String addingChars = "hello" + 'A' + ',' + 'B';
		
		System.out.println("adding single char to the string at the end - "+addingChar);
		System.out.println("adding miltiple chars to the string at the end - "+addingChars);
		
	}
}
