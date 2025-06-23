package com.Java8features.Date_Time_Api;

import java.time.LocalDate;

public class Localdate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(2000, 12, 15);
        System.out.println(birthday);

           int dayodmonth = today.getDayOfMonth();
           int dyaofyear = today.getDayOfYear();
           int year = today.getYear();
        System.out.println(dayodmonth);
        System.out.println(dayodmonth);
        System.out.println(year);


        LocalDate yesterday = today.minusDays(1);
        LocalDate pastdate = today.minusDays(100);
        System.out.println(yesterday);
        System.out.println(pastdate);
    }
}
