package com.javaprogramto.java8.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Java8AddDaysExample {
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

		localDateTime = localDateTime.plusYears(2);
		localDateTime = localDateTime.plusMonths(2);
		localDateTime = localDateTime.plusDays(2);

		localDateTime = localDateTime.plusHours(2).plusMinutes(2).plusSeconds(2);

		// converting LocalDateTime to Date
		Date currentDatePlus = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		// printing the new date
		String newDateinStr = dateFormat.format(currentDatePlus);
		System.out.println("New date after adding 2 years : " + newDateinStr);

	}
}
