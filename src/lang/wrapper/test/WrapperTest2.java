package lang.wrapper.test;

import java.util.Arrays;

public class WrapperTest2 {
    public static void main(String[] args) {
        
        
        String[] array = {"1.5", "2.5", "3.0"};
        
        double sum = Arrays.stream(array).mapToDouble(Double::parseDouble).sum();
        System.out.println("sum = " + sum);
        
    }
}
