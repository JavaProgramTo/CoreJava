package com.javaprogramto.java8.dates.nextprevious;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NextPreviousFromUtilDate {

	// Millseconds in a day
	private static final long ONE_DAY_MILLI_SECONDS = 24 * 60 * 60 * 1000;

	// date format
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {

		// current date time
		Date currentDate = new Date();

		// Simple date formatter to show in the input and output dates to redable form.
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

		// Getting the next day and formatting into 'YYYY-MM-DD'
		long nextDayMilliSeconds = currentDate.getTime() + ONE_DAY_MILLI_SECONDS;
		Date nextDate = new Date(nextDayMilliSeconds);
		String nextDateStr = dateFormat.format(nextDate);

		// Getting the previous day and formatting into 'YYYY-MM-DD'
		long previousDayMilliSeconds = currentDate.getTime() - ONE_DAY_MILLI_SECONDS;
		Date previousDate = new Date(previousDayMilliSeconds);
		String previousDateStr = dateFormat.format(previousDate);

		// printing the input, tomorrow and yesterday's date as strings.
		System.out.println("Current Date : " + dateFormat.format(currentDate));
		System.out.println("Next Date : " + nextDateStr);
		System.out.println("Previous Date : " + previousDateStr);

	}

}
