package com.athensoft.datetime;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        //ZoneId
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);
        System.out.println(zoneId.getId());

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        allZoneIds.stream().forEach(System.out::println);
        allZoneIds.stream().filter(x->x.contains("Canada")).forEach(System.out::println);
        allZoneIds.stream().filter(x->x.contains("Asia")).forEach(System.out::println);

        //The LocalDateTime can be converted to a specific zone
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);

    }
}
