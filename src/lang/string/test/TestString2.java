package lang.string.test;

import java.util.Arrays;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        
        int sum = Arrays.stream(arr).mapToInt(String::length).sum();
        System.out.println(sum);
    }
}
