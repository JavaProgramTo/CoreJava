package com.javaprogramto.java8.dates.conversion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class SingleLineCalenderToLocalDateTimeExample {

    public static void main(String[] args) {

        //Create a calender instance.
        Calendar calendar = Calendar.getInstance();


        LocalDateTime singleLineLocalDateTime = getLocalDateTime(calendar);
        LocalDate singleLineLocalDate = getLocalDate(calendar);

        System.out.println("Converted LocalDateTime : "+singleLineLocalDateTime);
        System.out.println("Converted LocalDate : "+singleLineLocalDate);

    }

    private static LocalDateTime getLocalDateTime(Calendar calendar){

        return  LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
    }

    private static LocalDate getLocalDate(Calendar calendar){

        return  LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId()).toLocalDate();
    }
}
