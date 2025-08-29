package nested.nested;

public class ShdoingMain {
    public int value = 1;
    
    class Inner {
        public int value = 2;
        
        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShdoingMain.value = " + ShdoingMain.this.value);
        }
    }
    
    public static void main(String[] args) {
        ShdoingMain main = new ShdoingMain();
        ShdoingMain.Inner inner = main.new Inner();
        inner.go();
    }
}
