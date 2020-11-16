package com.javaprogramto.java8.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * To remove the date from current date time.
 * 
 * @author javaprogramto.com
 *
 */
public class Java8MinusDaysExample {
	public static void main(String[] args) {
		// date formats
		String format = "yyyy-MM-dd hh:mm:ss";
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);

		// Date format in java 8
		DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(format);

		// creating date in java
		Date date = new Date();

		// printing the date in the readable format.
		String dateStr = dateFormat.format(date);
		System.out.println("Current date : " + dateStr);

		// converting date to LocalDateTime
		LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("localDateTime : " + dateFormat8.format(localDateTime));

		localDateTime = localDateTime.minusYears(2);
		localDateTime = localDateTime.minusMonths(2);
		localDateTime = localDateTime.minusDays(2);

		localDateTime = localDateTime.minusHours(2).minusMinutes(2).minusSeconds(2);

		// converting LocalDateTime to Date
		Date currentDateminus = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		// printing the new date
		String newDateinStr = dateFormat.format(currentDateminus);
		System.out.println("New date after going back 2 years : " + newDateinStr);

	}
}
