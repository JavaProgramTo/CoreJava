package com.javaprogramto.chars;

public class AddCharToStringExample4 {

	public static void main(String[] args) {

		String longString = "very difficult to beat 90% in engineering";

		String addMiddle = longString.substring(0, longString.length() / 2) + ','
				+ longString.substring(longString.length() / 2);

		System.out.println("after adding in middle : " + addMiddle);

		String atStartOfString = 'A' + longString.substring(0);
		String atEndOfString = longString.substring(0) + 'A';
		
		System.out.println("At start of string : "+atStartOfString);
		System.out.println("At end of string : "+atEndOfString);
	}
}
