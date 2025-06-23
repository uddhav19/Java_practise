package com.Java8features.Date_Time_Api;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2004, 5, 19);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
