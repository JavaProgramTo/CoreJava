package com.javaprogramto.java8.dates.diff.days;

import java.util.Date;

/**
 * 
 * @author javaprogramto.com
 *
 */
public class CalculatedNoOfDaysExample {
	
	public static void main(String[] args) {
		
		// creating the date 1 with sample input date.
		Date date1 = new Date(2020, 11, 1);
		
		// creating the date 2 with sample input date.
		Date date2 = new Date(2020, 11, 30);
		
		// getting milliseconds for both dates
		long date1InMs = date1.getTime();
		long date2InMs = date2.getTime();
		
		// getting the diff between two dates.
		long timeDiff = 0;
		if(date1InMs > date2InMs) {
			timeDiff = date1InMs - date2InMs;
		} else {
			timeDiff = date2InMs - date1InMs;
		}
		
		// converting diff into days
		int daysDiff = (int) (timeDiff / (1000 * 60 * 60* 24));
		
		// print diff in days
		System.out.println("No of days diff is : "+daysDiff);
		
	}

}
