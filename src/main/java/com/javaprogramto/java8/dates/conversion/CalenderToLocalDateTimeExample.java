package com.javaprogramto.java8.dates.conversion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class CalenderToLocalDateTimeExample {

    public static void main(String[] args) {

        //Create a calender instance.
        Calendar calendar = Calendar.getInstance();

        System.out.println("Calender instance : "+calendar);

        // Getting the timezone
        TimeZone tz = calendar.getTimeZone();

        // Getting zone id
        ZoneId zoneId = tz.toZoneId();

        // conversion
        LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), zoneId);

        System.out.println("Local date time object  : "+localDateTime);

        LocalDateTime singleLineLocalDateTime = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
        LocalDate singleLineLocalDate = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId()).toLocalDate();


    }
}
