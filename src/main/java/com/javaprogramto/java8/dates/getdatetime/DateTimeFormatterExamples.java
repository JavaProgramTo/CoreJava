package com.javaprogramto.java8.dates.getdatetime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExamples {

	public static void main(String[] args) {
		DateTimeFormatter formatterInJava8 = DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm:ss");
		
		LocalDateTime LocalDateTimeCurrentTime = LocalDateTime.now();
		String date1 = formatterInJava8.format(LocalDateTimeCurrentTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		String date2 = formatterInJava8.format(zonedDateTime);
		
		System.out.println("Date in custom format : ");
		System.out.println("Current date time from LocalDateTime : "+date1);
		System.out.println("Current date time from ZonedDateTime : "+date2);
	}
}
