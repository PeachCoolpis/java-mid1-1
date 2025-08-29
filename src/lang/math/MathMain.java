package lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println("max(10,20) : " +  Math.max(10,20));
        System.out.println("min(10,20) : " +  Math.min(10,20));
        System.out.println("abs(-10) : " +  Math.abs(-10));
        
        Math.ceil(2.1); // 내림
        Math.floor(2.1); // 내림
        Math.round(2.5); //반올림
        
        
        double sqrt = Math.sqrt(4); // 제곱근
        double random = Math.random();
        System.out.println("random = " + random);
    }
}
