package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC);
        System.out.println(Grade.GOLD);
        System.out.println(Grade.DIAMOND);
        
        System.out.println(refValue(Grade.BASIC));
        System.out.println(refValue(Grade.GOLD));
    }
    
    public static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
