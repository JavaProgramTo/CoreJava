package com.javaprogramto.java8.dates.parse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTimeToString {

	public static void main(String[] args) {

		// Getting LocalDateTime object.
		LocalDateTime datetime = getLocalDateTime();
		
		// Creating datetimeformatter object with pattern "yyyy-MMM-dd hh:mm a"
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm a");
		
		// formatting LocalDateTime to String
		String dateInString = datetime.format(dateTimeFormatter);
		
		// printing the output string
		System.out.println("LocalDateTime back in String form : "+dateInString);

	}

	private static LocalDateTime getLocalDateTime() {
		// Date in string format
		String dateInStr = "2022-01-01 23:30:50";

		// Creating datetimeformatter object with pattern "yyyy-MM-dd HH:mm:ss"
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		// Returning LocalDateTime object.
		return LocalDateTime.parse(dateInStr, dateTimeFormatter);

	}

}
