package com.javaprogramto.programs.escape.newline;

public class AddNewLineExample2 {

	public static void main(String[] args) {

		// windows os
		String line1 = "Hello engeers";
		String line2 = "hope you are staying safe";

		String line3 = line1 + "\r\n" + line2;

		System.out.println("windwos print newline with \\r\\n");
		System.out.println(line3);
	}
}
