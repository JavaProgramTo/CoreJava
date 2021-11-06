package com.javaprogramto.programs.strings.todouble.decimal;

import java.text.NumberFormat;
import java.util.Formatter;

public class StringToDoubleDecimalsPlaces4 {

	public static void main(String[] args) {

		double doubleDecimalValue = 9.144678376262;

		System.out.println("Double value : " + doubleDecimalValue);

		// 1. NumberFormat
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);

		System.out.println("Number format : " + nf.format(doubleDecimalValue));

		// 2. Formatter
		Formatter formatter = new Formatter();
		formatter.format("%.2f", doubleDecimalValue);

		System.out.println("Formatter : " + formatter.toString());

		// 3. Printf
		System.out.printf("printf : Double upto 2 decimal places: %.2f", doubleDecimalValue);

	}
}
