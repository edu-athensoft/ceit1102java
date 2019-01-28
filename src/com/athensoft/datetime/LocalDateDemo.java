package com.athensoft.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(localDate);


        localDate = LocalDate.of(2015, 02, 20);
        System.out.println(localDate);

        localDate = LocalDate.parse("2015-02-20");
        System.out.println(localDate);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek sunday = LocalDate.parse("2019-01-27").getDayOfWeek();
        System.out.println(sunday.getValue());

        int twelve = LocalDate.parse("2019-01-27").getDayOfMonth();
        System.out.println(twelve);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);

        boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));

        boolean isAfter =  LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));


    }

}
