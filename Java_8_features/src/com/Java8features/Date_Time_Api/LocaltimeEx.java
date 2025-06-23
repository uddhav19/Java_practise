package com.Java8features.Date_Time_Api;

import java.time.LocalTime;

public class LocaltimeEx {
    public static void main(String[] args) {
        LocalTime currenttime = LocalTime.now();
        System.out.println(currenttime);

        LocalTime customtime = LocalTime.of(2,34 ,56,34);
        System.out.println(customtime);


        String timeinstring = "03:12:34";
        LocalTime parse = LocalTime.parse(timeinstring);
        System.out.println(parse);

    }
}
