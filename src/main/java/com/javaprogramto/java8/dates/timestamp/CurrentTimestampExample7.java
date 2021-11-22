package com.javaprogramto.java8.dates.timestamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimestampExample7 {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");

		String timestamp = formatter.format(localDateTime);

		System.out.println("timestamp now : " + timestamp);
	}
}
