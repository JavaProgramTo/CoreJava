package com.javaprogramto.strings.compare;

public class StringDoesnotEqual {

	public static void main(String[] args) {
		
		String status = getValidationStatus(10);
		System.out.println("status :  "+status);
		
		if (status.intern() != "Failure") {
			System.out.println("Valid age");
		} else {
			System.out.println("Invalid age");
		}

	}

	public static String getValidationStatus(int age) {

		if (age < 18) {
			return new String("Failure");
		}

		return new String ("Success");
	}
}
