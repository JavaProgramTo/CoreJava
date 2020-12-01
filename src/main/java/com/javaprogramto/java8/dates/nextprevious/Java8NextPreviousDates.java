package com.javaprogramto.java8.dates.nextprevious;

import java.text.ParseException;
import java.time.LocalDate;

/**
 * How to get the next and previous dates in java 8?
 * 
 * @author javaprogramto.com
 *
 */

public class Java8NextPreviousDates {

	public static void main(String[] args) throws ParseException {

		// Obtaining current date
		LocalDate currentDate = LocalDate.now();

		// Getting the next date using plusDays() method
		LocalDate nextDate = currentDate.plusDays(1);

		// Getting the previous date using minusDays() method
		LocalDate previousDate = currentDate.minusDays(1);

		// printing the input, tomorrow and yesterday's dates
		System.out.println("Current Date : " + currentDate);
		System.out.println("Next Date : " + nextDate);
		System.out.println("Previous Date : " + previousDate);

	}

}
