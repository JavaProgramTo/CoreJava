package com.javaprogramto.java8.dates.compare;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Example program to compare two dates in java 8 with LocalDateTime.
 * 
 * @author JavaProgramTo.com
 *
 */
public class DateCompareLocalDateTimeInJava8 {

	public static void main(String[] args) throws ParseException {

		// Creating first date using LocalDateTime.of() method.
		LocalDateTime datetime1 = LocalDateTime.of(2021, 02, 01, 01, 01, 01);

		// Creating second date using LocalDateTime.now() method with milliseconds.
		LocalDateTime datetime2 = LocalDateTime.now();

		// comparing dates with isEqual(), isAfter() and isBefore() methods.
		boolean isEqual = datetime1.isEqual(datetime2);
		boolean isAfter = datetime1.isAfter(datetime2);
		boolean isBefore = datetime1.isBefore(datetime2);

		// java 8 date comparisons results
		System.out.println("DateTime 1 and DateTime 2 are equals? : " + isEqual);
		System.out.println("DateTime 1 is after DateTime 2? : " + isAfter);
		System.out.println("DateTime 1 is before DateTime 2? : " + isBefore);
	}

}
