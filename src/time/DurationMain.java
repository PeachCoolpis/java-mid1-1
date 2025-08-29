package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);
        
        
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between.getSeconds() / 60);
        System.out.println("between = " + between.getNano());
        
        System.out.println("between = " + between.toHours() + " "  + between.toMinutesPart());
        
    }
}
