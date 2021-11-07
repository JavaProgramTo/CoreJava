package com.javaprogramto.programs.strings.tofloat;

public class FloatToStringExample {

	public static void main(String[] args) {

		// example 1 - valueOf()
		float primitiveFloat1 = 456.78f;

		String floatInString = String.valueOf(primitiveFloat1);

		System.out.println("Pritive float value 1 : " + primitiveFloat1);
		System.out.println("Float to String 1 : " + floatInString);

		// example 2 - valueOf()

		Float primitiveFloat2 = 456.78F;

		String floatInString2 = String.valueOf(primitiveFloat2);

		System.out.println("Pritive float value 2 : " + primitiveFloat2);
		System.out.println("Float to String 2 : " + floatInString2);

		// Example 3 - toString()

		float primitiveFloat3 = new Float(12367.987);

		String floatInString3 = Float.toString(primitiveFloat3);

		System.out.println("Pritive float value 3 : " + primitiveFloat3);
		System.out.println("Float to String 3 : " + floatInString3);
	}
}
