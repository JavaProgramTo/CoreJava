package com.javaprogramto.programs;

public class LeapYearExample {

	public static void main(String[] args) {

		int year = 1700;
		boolean leapyear = false;

		// step 1: year is divisible by 4
		if (year % 4 == 0) {
			// step 2: if year is divisible by 100
			if (year % 100 == 0) {

				// step 3 year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0)
					leapyear = true;
				else
					leapyear = false;
			} else
				leapyear = true;
		} else
			leapyear = false;

		if (leapyear)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");

	}

}
