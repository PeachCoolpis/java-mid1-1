package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + dt);
        
        
        LocalDateTime with1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("with1 = " + with1);
        
        LocalDateTime localDateTime = dt.withYear(2020);
        System.out.println("localDateTime = " + localDateTime);
        
        LocalDateTime with = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("with = " + with);
        
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("with2 = " + with2);
    }
}
