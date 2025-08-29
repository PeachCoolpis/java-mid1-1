package lang.method;

public class StringChangeMain {
    public static void main(String[] args) {
        
        String str = "Hello, Java! Welcome to Java";
        
        String java = str.substring(str.indexOf("Java"), str.lastIndexOf("Welcome"));
        System.out.println(java);
        
        
    }
}
