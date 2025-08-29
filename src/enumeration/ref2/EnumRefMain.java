package enumeration.ref2;


import static enumeration.ref2.Grade.*;

public class EnumRefMain {
    public static void main(String[] args) {
        int price = 10_000;
        
        DisCountService disCountService = new DisCountService();
        
        int basic = disCountService.discount(BASIC, price);
        int gold = disCountService.discount(GOLD, price);
        int diamond = disCountService.discount(DIAMOND, price);
        
        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
