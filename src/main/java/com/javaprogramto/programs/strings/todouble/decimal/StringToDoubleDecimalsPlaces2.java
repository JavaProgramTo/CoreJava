package com.javaprogramto.programs.strings.todouble.decimal;

public class StringToDoubleDecimalsPlaces2 {

	public static void main(String[] args) {
		
		String decimalValueInString = "9.144678376262";
		
		// convert string to double
		
		double doubleDecimalValue = Double.parseDouble(decimalValueInString);
		
		System.out.println("Double in string : "+decimalValueInString);
		System.out.println("Double value : "+doubleDecimalValue);
		
		String strDoubleDecimals = String.format("%.2f", doubleDecimalValue);
		
		System.out.println("Double with 2 decimal values : "+strDoubleDecimals);
		
	}
}
