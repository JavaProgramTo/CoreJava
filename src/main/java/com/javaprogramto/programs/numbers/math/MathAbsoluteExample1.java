package com.javaprogramto.programs.numbers.math;

public class MathAbsoluteExample1 {

	public static void main(String[] args) {

		// for integer primitive values
		int i = -100;
		int absValueofI = Math.abs(i);

		System.out.println("abs value of " + i + " is " + absValueofI);

		i = 200;
		absValueofI = Math.abs(i);

		System.out.println("abs value of " + i + " is " + absValueofI);

		i = -0;
		absValueofI = Math.abs(i);

		System.out.println("abs value of " + i + " is " + absValueofI);

	}

}
