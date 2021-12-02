package com.javaprogramto.programs.numbers.math;

public class MathAbsoluteExample3 {

	public static void main(String[] args) {

		// for Wrapper Integer values
		Integer integer = -100;
		Integer absValueofInteger = Math.abs(integer);

		System.out.println("Integer - abs value of " + integer + " is " + absValueofInteger);

		integer = 200;
		absValueofInteger = Math.abs(integer);

		System.out.println("Integer - abs value of " + integer + " is " + absValueofInteger);

		integer = -0;
		absValueofInteger = Math.abs(integer);

		System.out.println("Integer - abs value of " + integer + " is " + absValueofInteger);
	}
}
