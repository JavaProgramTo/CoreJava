package com.javaprogramto.programs.numbers.math;

public class MathAbsoluteExample2 {

	public static void main(String[] args) {

		// for long primitive values
		long l = -100;
		long absValueofL = Math.abs(l);

		System.out.println("abs value of " + l + " is " + absValueofL);

		l = 200;
		absValueofL = Math.abs(l);

		System.out.println("abs value of " + l + " is " + absValueofL);

		l = -0;
		absValueofL = Math.abs(l);

		System.out.println("abs value of " + l + " is " + absValueofL);

	}

}
