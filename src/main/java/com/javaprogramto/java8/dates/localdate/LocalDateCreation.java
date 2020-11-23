package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

public class LocalDateCreation {

	public static void main(String[] args) {

		// Dates creation with now() and of() methods.
		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = LocalDate.of(2025, 10, 10);

		// printing the dates.
		System.out.println("Current date : " + currentDate);
		System.out.println("Future date : " + futureDate);

	}

}
