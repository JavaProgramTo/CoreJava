package com.javaprogramto.java8.dates.diff.days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author javaprogramto.com
 *
 */
public class CalculatedNoOfDaysDatesInStringExample {
	
	public static void main(String[] args) throws ParseException {
		
		// input string date format
		String DATE_FORAT = "yyyy-MM-dd";
		
		// creating simple date formatter using string format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORAT);
		
		// Create two Dates in String varaible
		String dateStr1 = "2021-01-01";
		String dateStr2 = "2021-01-31";
		
		// converting string dateStr1 to date using simpledateformat.
		Date date1 = simpleDateFormat.parse(dateStr1);
		
		// converting string dateStr2 to date using simpledateformat.
		Date date2 = simpleDateFormat.parse(dateStr2);;
		
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
		System.out.println("No of days diff is using String Dates : "+daysDiff);
		
	}
}
