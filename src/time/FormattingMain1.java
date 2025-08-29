package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 12, 31);
        System.out.println("localDate = " + localDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = dateTimeFormatter.format(localDate);
        System.out.println("format = " + format);
        
        LocalDate parse = LocalDate.parse(format, dateTimeFormatter);
        System.out.println("parse = " + parse);
        
    }
}
