package com.javaprogramto.java8.dates.conversion;

import org.joda.time.DateTime;
/**
 * A simple example to set the current date to old date using joda api.  
 * 
 * @author javaprogramto.com
 *
 */
public class JodaDateDecrement {

	public static void main(String[] args) {

		String dateFormat = "yyyy-MM-dd";

		// creating joda date time object
		DateTime dateTime = new DateTime();

		// printing the current date in format "yyyy-MM-dd"
		System.out.println("Joda current date time : " + getDate(dateTime, dateFormat));

		// decreasing two years, two months and two days to the current date
		dateTime = dateTime.minusDays(2).minusMonths(2).minusYears(2);

		// printing the modified datetime object
		System.out.println("Joda date after setting old date: " + getDate(dateTime, dateFormat));

	}

	// getting the date in the given format
	private static String getDate(DateTime dateTime, String dateFormat) {
		return dateTime.toString(dateFormat);
	}

}
