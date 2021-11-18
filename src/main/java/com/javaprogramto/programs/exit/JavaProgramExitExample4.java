package com.javaprogramto.programs.exit;

public class JavaProgramExitExample4 {

	public static void main(String[] args) {

		System.out.println("first line from main method");

		int number = 10;
		String value = getValue(number);
		System.out.println(value);
		System.out.println("last line from main method");
	}

	private static String getValue(int number) {
		
		System.out.println("statement 1");
		
		if(number % 2 == 0) {
			return "even number";
		}
		else {
			return "odd number";
		}
	}

}
