package com.javaprogramto.programs.escape.newline;

public class AddNewLineExample4 {

	public static void main(String[] args) {

		// Using java api system class getProperty() method
		String line1 = "Hello engeers";
		String line2 = "hope you are staying safe";

		String line3 = line1 + System.getProperty("line.separator") + line2;

		System.out.println("print newline with System.getPropertyr() method");
		System.out.println(line3);
	}
}
