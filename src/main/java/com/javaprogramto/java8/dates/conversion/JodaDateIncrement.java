package com.javaprogramto.java8.dates.conversion;

import org.joda.time.DateTime;

public class JodaDateIncrement {

	public static void main(String[] args) {

		String dateFormat = "yyyy-MM-dd";

		// creating joda date time object
		DateTime dateTime = new DateTime();

		// printing the current date in format "yyyy-MM-dd"
		System.out.println("Joda current date time : " + getDate(dateTime, dateFormat));

		// incrementing two days to the current date
		dateTime = dateTime.plusDays(2);

		// printing the modified datetime object
		System.out.println("Joda date after adding two days : " + getDate(dateTime, dateFormat));

	}

	// getting the date in the given format
	private static String getDate(DateTime dateTime, String dateFormat) {
		return dateTime.toString(dateFormat);
	}

}
