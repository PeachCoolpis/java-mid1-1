package lang.string.test;

import java.util.Arrays;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        String[] split = str.split(" ");
        long count = Arrays.stream(split).filter(item -> item.equals(key)).count();
        System.out.println(count);
    }
}
