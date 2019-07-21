package com.company;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) {
        Main test = new Main();
        test.Age();
        test.dateDifference();
        test.formatDate();
        test.surfaceCircle();
    }

    public void Age() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2000, 1, 21, 14, 00);
        long gap = ChronoUnit.YEARS.between(birthday, start);
        System.out.println("Года:" + gap);
        gap = ChronoUnit.MONTHS.between(birthday, start);
        System.out.println("Месяцы:" + gap);
        gap = ChronoUnit.DAYS.between(birthday, start);
        System.out.println("Дни:" + gap);
        gap = ChronoUnit.HOURS.between(birthday, start);
        System.out.println("Часы:" + gap);
        gap = ChronoUnit.MINUTES.between(birthday, start);
        System.out.println("Минуты:" + gap);
        gap = ChronoUnit.SECONDS.between(birthday, start);
        System.out.println("Секунды:" + gap);
    }

    public void dateDifference() {
        LocalDateTime firstDate = LocalDateTime.of(1923, 01, 01, 00, 00);
        LocalDateTime secondDate = LocalDateTime.of(1981, 12, 12, 00, 00);
        long gap = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Days between:" + abs(gap));
    }

    public void formatDate() {
        String input = "Monday, Jul 15, 2019 12:00:00 PM";
        DateTimeFormatter isoDateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm:ss a");
        System.out.println(isoDateFormatter.format(LocalDate.parse(input, dateTimeFormatter)));
    }

    public void surfaceCircle() {
        BigDecimal PI = new BigDecimal(3.14159265358979323846264338327950288419716939937510);
        BigDecimal radius = new BigDecimal(3);
        BigDecimal result = radius.pow(2).multiply(PI);
        result = result.setScale(50);
        System.out.println(result);
    }
}


