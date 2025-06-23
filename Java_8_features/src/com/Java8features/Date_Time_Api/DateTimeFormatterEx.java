package com.Java8features.Date_Time_Api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 6, 23);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);

        System.out.println(formattedDate);
    }
}
