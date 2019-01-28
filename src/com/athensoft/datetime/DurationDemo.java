package com.athensoft.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) {
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        System.out.println(finalTime);

        long thirty = Duration.between(initialTime, finalTime).getSeconds();
        System.out.println(thirty);

        long thirty2 = ChronoUnit.SECONDS.between(finalTime, initialTime);


    }
}
