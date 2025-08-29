package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println(period);
        
        LocalDate currentDate = LocalDate.of(2023, 1, 1);
        LocalDate plus = currentDate.plus(period);
        System.out.println(plus);
        
        
        LocalDate startDate = LocalDate.of(2023, 4, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        
        Period between = Period.between(startDate, endDate);
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
    }
}
