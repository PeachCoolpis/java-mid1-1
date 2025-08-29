package enumeration.test;

import enumeration.ex3.Grade;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            String format = String.format("grade = %s, level=%s, 설명=%s", value.name(), value.getLevel(), value.getDescription());
            System.out.println(format);
        }
        
    }
}
