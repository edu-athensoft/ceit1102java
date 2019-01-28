package com.athensoft.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(localDateString);

        localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));



    }
}
