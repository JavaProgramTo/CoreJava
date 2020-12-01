package com.javaprogramto.java8.dates.nextprevious;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NextPreviousFromStringDate {

	// Millseconds in a day
	private static final long ONE_DAY_MILLI_SECONDS = 24 * 60 * 60 * 1000;

	// date format
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {

		// Date in string format as "YYYY-MM-DD"
		String dateInString = "2021-12-12";

		// Simple date formatter
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		Date date = dateFormat.parse(dateInString);

		// Getting the next day and formatting into 'YYYY-MM-DD'
		long nextDayMilliSeconds = date.getTime() + ONE_DAY_MILLI_SECONDS;
		Date nextDate = new Date(nextDayMilliSeconds);
		String nextDateStr = dateFormat.format(nextDate);

		// Getting the previous day and formatting into 'YYYY-MM-DD'
		long previousDayMilliSeconds = date.getTime() - ONE_DAY_MILLI_SECONDS;
		Date previousDate = new Date(previousDayMilliSeconds);
		String previousDateStr = dateFormat.format(previousDate);

		// printing the input, tomorrow and yesterday's date as strings. 
		System.out.println("Given Date : " + dateInString);
		System.out.println("Next Date : " + nextDateStr);
		System.out.println("Previous Date : " + previousDateStr);

	}

}
