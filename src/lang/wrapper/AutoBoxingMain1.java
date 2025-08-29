package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        
        int value = 7;
        
        Integer boxValue = Integer.valueOf(value);
        
        int i = boxValue.intValue();
    }
}
