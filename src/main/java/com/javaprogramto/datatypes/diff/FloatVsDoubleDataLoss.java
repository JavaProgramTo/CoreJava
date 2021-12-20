package com.javaprogramto.datatypes.diff;

public class FloatVsDoubleDataLoss {

	public static void main(String[] args) {

		// double examples
		double d = 1.2345678912345678;

		float f = (float) d;

		System.out.println("float value after double to float conversion (data loss) - " + f);

		// float examples
		float f1 = 1.1111111f;

		double d1 = f1;

		System.out.println("\n" + "double value after float to double conversion - " + d1);
	}
}
