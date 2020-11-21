package com.javaprogramto.java8.dates.compare;

import java.text.ParseException;
import java.time.LocalDate;

/**
 * Example program to compare two dates in java 8 with LocalDate.
 * 
 * @author JavaProgramTo.com
 *
 */
public class DateCompareInJava8 {

	public static void main(String[] args) throws ParseException {
		
		// Creating first date using LocalDate.of() method.
		LocalDate date1 = LocalDate.of(2021, 01, 01);
		
		// Creating second date using LocalDate.of() method.
		LocalDate date2 = LocalDate.of(2021, 02, 01);
		
		// comparing dates with isEqual(), isAfter() and isBefore() methods.
		boolean isEqual = date1.isEqual(date2);
		boolean isAfter = date1.isAfter(date2);
		boolean isBefore = date1.isBefore(date2);
		
		// java 8 date comparisons results
		System.out.println("Date 1 and Date 2 are equals? : "+isEqual);
		System.out.println("Date 1 is after Date 2? : "+isAfter);
		System.out.println("Date 1 is before Date 2? : "+isBefore);
		

		// comparing two dates older way with compareTo() method.
		int dateOrder = date1.compareTo(date2);
		
		// printing the date comparison value returned by compareTo() method
		System.out.println("Dates comparision value with compareTo() returned value : "+dateOrder);
		
		// Deciding the dates order.
		if(dateOrder == 0) {
			System.out.println("Date 1 and Date 2 are equal.");
		} else if(dateOrder > 0) {
			System.out.println("Date 1 is after Date 2.");
		} else {
			System.out.println("Date 1 before Date 2");
		}

	}

}
