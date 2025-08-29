package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 1, 1, 1);
        System.out.println("localDateTime = " + localDateTime);
        
        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        
        LocalDateTime localDateTime1 = localDateTime.plusDays(10);
        System.out.println("localDateTime1 = " + localDateTime1);
        
        boolean before = localDateTime1.isBefore(localDateTime);
        boolean after = localDateTime1.isAfter(localDateTime);
        System.out.println("before = " + before);
    }
}
