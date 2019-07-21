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

    /*
    Определить возраст с момента рождения  на момент запуска программы.
    Возраст в секундах, минутах, часах, днях, месяцах и годах
    */

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

    /*
    Даны две даты в виде 25.07.1921, т.е. день месяца 2 разряда,
    месяц 2 разряда, год 4 разряда. Найти разницу в днях между
    ними. Число должно быть всегда положительным
    */

    public void dateDifference() {
        LocalDateTime firstDate = LocalDateTime.of(1923, 01, 01, 00, 00);
        LocalDateTime secondDate = LocalDateTime.of(1981, 12, 12, 00, 00);
        long gap = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Days between:" + abs(gap));
    }

    /*
    Дана строка вида Friday, Aug 10, 2016 12:10:56 PM.
    Необходимо сконвертировать ее в вид “2018-0 8-10".
    */

    public void formatDate() {
        String input = "Monday, Jul 15, 2019 12:00:00 PM";
        DateTimeFormatter isoDateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm:ss a");
        System.out.println(isoDateFormatter.format(LocalDate.parse(input, dateTimeFormatter)));
    }

    /*
    Необходимо посчитать площадь круга с указанным радиусом с точностью 50 знаков после запятой
    */
    
    public void surfaceCircle() {
        BigDecimal PI = new BigDecimal(3.14159265358979323846264338327950288419716939937510);
        BigDecimal radius = new BigDecimal(3);
        BigDecimal result = radius.pow(2).multiply(PI);
        result = result.setScale(50);
        System.out.println(result);
    }
}


