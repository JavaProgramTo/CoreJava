package com.javaprogramto.datatypes.diff;

public class FloatVsDoubleSuffix {

	public static void main(String[] args) {

		// double examples
		double d = 10.9876;

		System.out.println("Double value no explicit usage of suffix - " + d);

		double d2 = 1.23456789d;
		System.out.println("Double value optionnal suffix d - " + d2);

		// float examples

		// Compile time error
		// float f3 = 123.456; // Type mismatch: cannot convert from double to float

		float f = 10.9876f;

		System.out.println("\n" + "Float value with explicit usage of suffix f - " + f);

		float f2 = (float) 1.23456789;
		System.out.println("float value with type casting - " + f2);

	}

}
