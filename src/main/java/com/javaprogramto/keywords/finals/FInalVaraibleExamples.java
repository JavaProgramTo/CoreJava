package com.javaprogramto.keywords.finals;

public class FInalVaraibleExamples {

	public static void main(String[] args) {

		// normal local variable
		int i = 10;
		i = 20;
		System.out.println("local i = " + i);

		// final local variable with value reassignment
		final int j = 10;

		// uncomment the below line to see compile time error 
		//j = 20; // compile time error
		System.out.println("final j = " + j);
	}

}
