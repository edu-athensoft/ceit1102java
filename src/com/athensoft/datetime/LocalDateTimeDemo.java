package com.athensoft.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
       LocalDateTime ldt =  LocalDateTime.now();
       System.out.println(ldt);

       LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
       LocalDateTime.parse("2015-02-20T06:30:00");

        ldt.plusDays(1);
        System.out.println(ldt);

        ldt.minusHours(2);
        System.out.println(ldt);

        Month m = ldt.getMonth();
        System.out.println(m);

        int m2 = ldt.getMonthValue();
        System.out.println(m2);

    }
}
