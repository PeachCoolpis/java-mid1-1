package lang.classz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // Class 조회
        Class clazz = String.class;
        //Class<? extends String> aClass = new String().getClass();
        //Class<?> aClass1 = Class.forName("java.lang.String");
        
        // 모든 필드 충력
        
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }
        
        
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        String name = clazz.getSuperclass().getName();
        System.out.println(name);
    }
}
