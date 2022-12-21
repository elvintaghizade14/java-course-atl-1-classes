package az.atlacademy.se.lesson14;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTimeApp {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now(); // static factory methods
        System.out.println(now);

        LocalDate date2 = LocalDate.of(2022, Month.DECEMBER, 21);
        System.out.println(date2);

        String a = "abc";
        System.out.println(a);
        System.out.println(a.concat("d"));
        System.out.println(a.concat("e"));
        System.out.println(a);
        String b = a;
        System.out.println(b);
        a = null;
        System.out.println(a);
        System.out.println(b);

        LocalDate parsedDate = LocalDate.parse("11/20/2000", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(parsedDate);
        System.out.println(parsedDate.plusDays(2));
        System.out.println(parsedDate.plusMonths(3));
        System.out.println(parsedDate);

        XDate xDate = XDate.of(21, Month.DECEMBER, 2022);
        System.out.println(xDate);

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(date2, nowTime);
        System.out.println(localDateTime);

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDay());
        date.setYear(1999);
        System.out.println(date);

        doAction(Period.ofDays(2));
        doAction(Period.ofYears(1));

        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime.of(date2, nowTime, ZoneId.of("-3"));
        LocalDateTime of = LocalDateTime.of(date2, nowTime);
        System.out.println(of);
    }

    private static void doAction(Period period) {
        System.out.println();
    }

}
