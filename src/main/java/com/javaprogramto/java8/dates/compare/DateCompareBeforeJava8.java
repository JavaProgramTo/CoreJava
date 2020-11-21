package com.javaprogramto.java8.dates.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example program to compare two dates in java
 * 
 * @author JavaProgramTo.com
 *
 */
public class DateCompareBeforeJava8 {

	public static void main(String[] args) throws ParseException {
		// Date format
		String DATE_FORMAT = "yyyy-MM-dd";
		
		// Creating an object for SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		
		// Date 1 created from string using SimpleDateFormat
		Date date1 = sdf.parse("2021-01-01");

		// Date 2 created from string using SimpleDateFormat
		Date date2 = sdf.parse("2021-02-01");
		
		// comparing two dates
		int dateOrder = date1.compareTo(date2);
		
		// printing the date comparison value returned by compareTo() method
		System.out.println("Dates comparision value : "+dateOrder);
		
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
