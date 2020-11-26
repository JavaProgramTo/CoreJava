package com.javaprogramto.java8.dates.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterFormatStyleExample23{

//DateTimeFormatterFormatStyleExample23.java
	public static void main(String[] args) {

		FormatStyle full = FormatStyle.FULL;

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(full);

		LocalDateTime datetime = LocalDateTime.now();

		String fullForm = datetime.format(formatter);

		System.out.println("Full date form in string : " + fullForm);
	}

}
