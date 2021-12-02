package com.javaprogramto.programs.numbers.math;

public class MathAbsoluteExample6 {

	public static void main(String[] args) {

		// for primitive Float values

		System.out.println("Float primitive");
		Float FloatPrimitive = -100f;
		Float absValueofFloat = Math.abs(FloatPrimitive);

		System.out.println("primitive Float - abs value of " + FloatPrimitive + " is " + absValueofFloat);

		FloatPrimitive = 200f;
		absValueofFloat = Math.abs(FloatPrimitive);

		System.out.println("primitive Float - abs value of " + FloatPrimitive + " is " + absValueofFloat);

		FloatPrimitive = -0f;
		absValueofFloat = Math.abs(FloatPrimitive);

		System.out.println("primitive Float - abs value of " + FloatPrimitive + " is " + absValueofFloat);

		// for Wrapper Float values
		System.out.println("\nFloat wrapper");
		Float FloatValue = Float.valueOf(-100);
		Float absValueofWrapperFloat = Math.abs(FloatValue);

		System.out.println("Float - abs value of " + FloatValue + " is " + absValueofWrapperFloat);

		FloatValue = Float.valueOf(100);
		absValueofWrapperFloat = Math.abs(FloatValue);

		System.out.println("Float - abs value of " + FloatValue + " is " + absValueofWrapperFloat);

		FloatValue = Float.valueOf(-0l);
		absValueofWrapperFloat = Math.abs(FloatValue);

		System.out.println("Float - abs value of " + FloatValue + " is " + absValueofWrapperFloat);
	}
}
