package com.javaprogramto.programs.strings.tofloat;

public class StringToFloatExample1 {

	public static void main(String[] args) {

		String floatValueInString1 = "789.12F3";

		float floatValue1 = Float.parseFloat(floatValueInString1);

		System.out.println("Float value in String : " + floatValueInString1);
		System.out.println("String to Float value : " + floatValue1);

		String floatValueInString2 = "123.45";

		float floatValue2 = Float.parseFloat(floatValueInString2);

		System.out.println("Float value in String : " + floatValueInString2);
		System.out.println("String to Float value : " + floatValue2);
	}
}
