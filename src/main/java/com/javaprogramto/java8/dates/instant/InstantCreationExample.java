package com.javaprogramto.java8.dates.instant;

import java.time.Instant;

public class InstantCreationExample {

	public static void main(String[] args) {

		// Creating instant object from now()
		Instant instant1 = Instant.now();
		System.out.println("Instant 1 value from now() - " + instant1);

		Instant instant2 = Instant.now();
		System.out.println("Instant 2 value from now() - " + instant2);
	}

}
