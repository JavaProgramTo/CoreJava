package com.javaprogramto.programs.strings.tofloat;

public class StringToFloatExample2 {

	public static void main(String[] args) {

		String floatValueInString1 = "789.123F";

		Float floatValue1 = Float.valueOf(floatValueInString1);

		System.out.println("Float value in String : " + floatValueInString1);
		System.out.println("String to Wrapper Float value : " + floatValue1);

		String floatValueInString2 = "123.45";

		Float floatValue2 = Float.valueOf(floatValueInString2);

		System.out.println("Float value in String : " + floatValueInString2);
		System.out.println("String to Wrapper Float value : " + floatValue2);
	}
}
