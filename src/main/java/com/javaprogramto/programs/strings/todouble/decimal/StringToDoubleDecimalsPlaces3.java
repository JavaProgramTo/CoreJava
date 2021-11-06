package com.javaprogramto.programs.strings.todouble.decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringToDoubleDecimalsPlaces3 {

	public static void main(String[] args) {
		
		String decimalValueInString = "9.144678376262";
		
		// convert string to double
		
		double doubleDecimalValue = Double.parseDouble(decimalValueInString);
		
		System.out.println("Double in string : "+decimalValueInString);
		System.out.println("Double value : "+doubleDecimalValue);
		
		// BigDecimal
		BigDecimal bigDecimal = new BigDecimal(doubleDecimalValue).setScale(2, RoundingMode.DOWN);
		//bigDecimal.setScale(0, RoundingMode.HALF_UP);
		System.out.println("Two decimals : "+bigDecimal.doubleValue());
		
	}
}
