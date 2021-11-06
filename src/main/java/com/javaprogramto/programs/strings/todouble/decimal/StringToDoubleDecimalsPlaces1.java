package com.javaprogramto.programs.strings.todouble.decimal;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StringToDoubleDecimalsPlaces1 {

	public static void main(String[] args) {
		
		String decimalValueInString = "9.144678376262";
		
		// convert string to double
		
		double doubleDecimalValue = Double.parseDouble(decimalValueInString);
		
		System.out.println("Double in string : "+decimalValueInString);
		System.out.println("Double value : "+doubleDecimalValue);
		
		// DecimalFormat class
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		System.out.println("Double with decimal places "+decimalFormat.format(doubleDecimalValue));
		
		decimalFormat.setRoundingMode(RoundingMode.UP);
		System.out.println("Double with decimal places with rounding up :  "+decimalFormat.format(doubleDecimalValue));
		
		decimalFormat.setRoundingMode(RoundingMode.DOWN);
		System.out.println("Double with decimal places with rounding down :  "+decimalFormat.format(doubleDecimalValue));
		
	}
}
