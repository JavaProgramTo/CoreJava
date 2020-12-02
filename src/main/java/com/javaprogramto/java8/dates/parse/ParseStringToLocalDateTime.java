package com.javaprogramto.java8.dates.parse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseStringToLocalDateTime {

	public static void main(String[] args) {
		
		// Date in string format
		String dateInStr = "2022-01-01 23:30:50";
		
		// Creating datetimeformatter object with pattern "yyyy-MM-dd HH:mm:ss"
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		// converting string to date time using custom formatter
		LocalDateTime datetime = LocalDateTime.parse(dateInStr, dateTimeFormatter);
		
		// printing the input and output
		System.out.println("Input date in string : "+dateInStr);
		System.out.println("Output LocalDateTime : "+datetime);
	}
}
