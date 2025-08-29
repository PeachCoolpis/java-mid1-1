package time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("YEAR = " + now.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = " + now.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + now.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + now.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("MINUTE_OF_HOUR = " + now.get(ChronoField.SECOND_OF_MINUTE));
    }
}
