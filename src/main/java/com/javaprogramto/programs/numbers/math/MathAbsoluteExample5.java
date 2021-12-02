package com.javaprogramto.programs.numbers.math;

public class MathAbsoluteExample5 {

	public static void main(String[] args) {

		// for primitive Double values

		System.out.println("double primitive");
		double doublePrimitive = -100;
		Double absValueofDouble = Math.abs(doublePrimitive);

		System.out.println("primitive double - abs value of " + doublePrimitive + " is " + absValueofDouble);

		doublePrimitive = 200l;
		absValueofDouble = Math.abs(doublePrimitive);

		System.out.println("primitive double - abs value of " + doublePrimitive + " is " + absValueofDouble);

		doublePrimitive = -0l;
		absValueofDouble = Math.abs(doublePrimitive);

		System.out.println("primitive double - abs value of " + doublePrimitive + " is " + absValueofDouble);

		// for Wrapper Double values
		System.out.println("\ndouble wrapper");
		Double DoubleValue = Double.valueOf(-100);
		Double absValueofWrapperDouble = Math.abs(DoubleValue);

		System.out.println("Double - abs value of " + DoubleValue + " is " + absValueofWrapperDouble);

		DoubleValue = Double.valueOf(100);
		absValueofWrapperDouble = Math.abs(DoubleValue);

		System.out.println("Double - abs value of " + DoubleValue + " is " + absValueofWrapperDouble);

		DoubleValue = Double.valueOf(-0l);
		absValueofWrapperDouble = Math.abs(DoubleValue);

		System.out.println("Double - abs value of " + DoubleValue + " is " + absValueofWrapperDouble);
	}
}
