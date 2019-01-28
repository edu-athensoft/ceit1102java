package com.athensoft.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.parse("2019-01-28");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println(finalDate);

        int five = Period.between(finalDate, initialDate).getDays();
        System.out.println(five);

        int five2 = Period.between(initialDate, finalDate).getDays();
        System.out.println(five2);

        long five3 = ChronoUnit.DAYS.between(finalDate , initialDate);
        System.out.println(five3);
    }


}
