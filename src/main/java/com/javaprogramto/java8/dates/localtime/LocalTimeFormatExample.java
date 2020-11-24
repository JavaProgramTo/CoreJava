package com.javaprogramto.java8.dates.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeFormatExample {
	public static void main(String[] args) {

		// LocalTime object with the current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : " + currentTime);

		// converting DateTime to String in format "hh:mm:ss"
		String timeInString = currentTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
		System.out.println("time 1 in string : " + timeInString);

		// converting DateTime to String in format "hh:mm:ss a"
		String time2InString = currentTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
		System.out.println("Time 2 in string : " + time2InString);
	}
}
