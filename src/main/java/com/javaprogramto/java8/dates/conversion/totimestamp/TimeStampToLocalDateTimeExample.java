package com.javaprogramto.java8.dates.conversion.totimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeStampToLocalDateTimeExample {

	public static void main(String[] args) {
		
		Timestamp timestamp = Timestamp.valueOf("2022-01-01 10:10:10");
		System.out.println("Timestamp "+timestamp);
		
		LocalDateTime localDateTime = timestamp.toLocalDateTime();
		System.out.println("Timestamp to LocalDateTime - "+localDateTime);
		
		LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
		System.out.println("Timestamp to LocalDate - "+localDateTime);
		

	}
}
