package com.Java8features.Date_Time_Api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEx {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(usTime);

        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
