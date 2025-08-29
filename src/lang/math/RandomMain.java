package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int randomInt = random.nextInt();
        
        System.out.println("randomInt = " + randomInt);
        
        
        random.nextInt(10); // 0 ~ 9 까지 출력
        
        
        int i = random.nextInt(51) + 50; // 0 ~ 99까지 출력
        
        
        
    }
}
