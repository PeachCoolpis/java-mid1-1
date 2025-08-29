package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2024, 1, 1);
        for (int i = 0; i <5 ; i++) {
            System.out.println(String.format("날짜 %s: %s", (i + 1), now.plusWeeks(i * 2)));
        }
    }
}
