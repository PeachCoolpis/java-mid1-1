package lang.classz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        //Class<?> aClass = Class.forName("lang.classz.Hello");
        
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String hello1 = hello.hello();
        System.out.println(hello1);
    }
}
