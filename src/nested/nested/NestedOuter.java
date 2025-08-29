package nested.nested;

public class NestedOuter {
    
    private static int outClassValue = 3;
    private int outInstanceValue = 2;
    
    static class Nested {
        private int nestedInstaceValue = 1;
        
        public void print() {
            System.out.println(nestedInstaceValue);
            
            System.out.println(outClassValue);
        }
    }
}
