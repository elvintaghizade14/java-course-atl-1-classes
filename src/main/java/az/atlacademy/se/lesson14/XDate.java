package az.atlacademy.se.lesson14;

import java.time.LocalDate;
import java.time.Month;

public final class XDate {

    private final int day;
    private final Month month;
    private final int year;

    private XDate(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static XDate of(int day, Month month, int year) {
        return new XDate(day, month, year);
    }

    @Override
    public String toString() {
        return "XDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
