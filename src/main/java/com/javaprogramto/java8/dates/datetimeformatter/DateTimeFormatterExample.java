package com.javaprogramto.java8.dates.datetimeformatter;

import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {

		// Predefined formats
		DateTimeFormatter predefinedFormat1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter predefinedFormat2 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter predefinedFormat3 = DateTimeFormatter.ISO_ZONED_DATE_TIME;

		// Custom formats
		DateTimeFormatter customFormat1 = DateTimeFormatter.ofPattern("yyyy-MMM");
		DateTimeFormatter customFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd at hh:mm a");
		DateTimeFormatter customFormat3 = DateTimeFormatter.ofPattern("yyyy-MM-dd z");

	}

}
