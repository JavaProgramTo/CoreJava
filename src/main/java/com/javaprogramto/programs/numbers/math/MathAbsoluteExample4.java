package com.javaprogramto.programs.numbers.math;

public class MathAbsoluteExample4 {

	public static void main(String[] args) {

		// for Wrapper Long values
		Long longValue = -100l;
		Long absValueofLong = Math.abs(longValue);

		System.out.println("Long - abs value of " + longValue + " is " + absValueofLong);

		longValue = 200l;
		absValueofLong = Math.abs(longValue);

		System.out.println("Long - abs value of " + longValue + " is " + absValueofLong);

		longValue = -0l;
		absValueofLong = Math.abs(longValue);

		System.out.println("Long - abs value of " + longValue + " is " + absValueofLong);
	}
}
