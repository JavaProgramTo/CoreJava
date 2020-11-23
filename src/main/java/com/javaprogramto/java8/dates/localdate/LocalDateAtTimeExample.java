package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAtTimeExample {

	public static void main(String[] args) {
		// localdate 
		LocalDate localDate = LocalDate.now();
		
		int hour = 10;
		int minute = 20;
		int second = 30;
		
		// setting time details and converting LocalDate to LocalDateTime.
		LocalDateTime dateAndTime = localDate.atTime(hour, minute, second);
		
		System.out.println("LocalDate : "+localDate);
		System.out.println("LocalDateTime : "+dateAndTime);

	}

}
