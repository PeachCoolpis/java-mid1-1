package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    
    public static void main(String[] args) {
        
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        
        for (Grade value : values) {
           // System.out.println("value = " + value);
         //   System.out.println("value.ordinal() = " + value.ordinal());
        }
        
        // String -> ENuM
        String gold = "gold";
        Grade grade = Grade.valueOf(gold.toUpperCase());
        System.out.println("grade = " + grade);
    }
}
