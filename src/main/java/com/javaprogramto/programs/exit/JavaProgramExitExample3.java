package com.javaprogramto.programs.exit;

public class JavaProgramExitExample3 {

	public static void main(String[] args) {

		System.out.println("first line from main method");

		method();

		System.out.println("last line from main method");
	}

	private static void method() {
		
		System.out.println("executing the method");
		return;
	}
}
