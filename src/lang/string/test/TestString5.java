package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        String hello = str.substring(0, str.indexOf(ext));
        String txt = str.substring(str.indexOf(ext));
        System.out.println("filename = "+ hello);
        System.out.println("extName = "+ txt);
        
    }
}
