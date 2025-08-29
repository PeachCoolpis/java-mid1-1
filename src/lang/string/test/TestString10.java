package lang.string.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        String collect = String.join("->", split);
        System.out.println("joinedString = " + collect);
    }
}
