package com.athensoft.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.toString());

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);

        LocalTime sixThirty1 = LocalTime.of(6, 20);
        System.out.println(sixThirty1);

        LocalTime sevenThirty2 = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println(sevenThirty2);

        int six = LocalTime.parse("06:30").getHour();

        LocalTime maxTime = LocalTime.MAX;
        System.out.println(maxTime);
    }
}
