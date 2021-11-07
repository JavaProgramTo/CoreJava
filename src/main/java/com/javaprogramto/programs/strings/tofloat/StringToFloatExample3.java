package com.javaprogramto.programs.strings.tofloat;

public class StringToFloatExample3 {

	public static void main(String[] args) {

		String floatValueInString1 = "789.123F";

		Float floatValue1 = new Float(floatValueInString1);

		System.out.println("Float value in String : " + floatValueInString1);
		System.out.println("String to Float value using constructor: " + floatValue1);

		String floatValueInString2 = "123.45";

		Float floatValue2 = new Float(floatValueInString2);

		System.out.println("Float value in String : " + floatValueInString2);
		System.out.println("String to Float value using constructor: " + floatValue2);
	}
}
