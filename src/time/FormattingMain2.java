package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 23, 1, 59);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        
        LocalDateTime parse = LocalDateTime.parse(format, dateTimeFormatter);
        System.out.println(parse);
    }
}
