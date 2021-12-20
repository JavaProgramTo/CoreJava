package com.javaprogramto.datatypes.diff;

public class FloatVsDoubleWrapper {

	public static void main(String[] args) {

		// Double wrapper
		Double d1 = new Double(123.456);
		System.out.println("Double d1 value - " + d1);

		Double d2 = new Double("7.890");
		System.out.println("Double d2 value - " + d2);

		Double d3 = Double.valueOf(12.456);
		System.out.println("Double d3 value - " + d3);

		// Float wrapper
		Float f1 = new Float(123.456);
		System.out.println("\n" + "Float f1 value - " + f1);

		Float f2 = new Float("7.890");
		System.out.println("Float f2 value - " + f2);

		Float f3 = Float.valueOf(12.456f);
		System.out.println("Float f3 value - " + f3);

	}
}
