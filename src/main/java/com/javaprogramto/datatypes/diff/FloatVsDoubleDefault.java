package com.javaprogramto.datatypes.diff;

public class FloatVsDoubleDefault {

	static float floatDefaultvalue;
	static double doubleDefaultvalue;

	public static void main(String[] args) {

		// default types
		double d = 12345.6789; // no error. so it is considered as double type.

		//float f = 12345.6789; // error. Type mismatch: cannot convert from double to float. float type is not
								// detected

		// default values

		System.out.println("Float type default value - " + floatDefaultvalue);
		System.out.println("Double type default value - " + doubleDefaultvalue);
	}
}
