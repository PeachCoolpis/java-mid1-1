package time;

import java.time.LocalDate;

public class LocalDateMain {
    
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        
        LocalDate localDate = LocalDate.of(2020, 1, 1);
        System.out.println("localDate = " + localDate);
        
        //계산
        LocalDate localDate1 = now.plusDays(10);
        System.out.println("localDate1 = " + localDate1);
        
    }
}
