package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");
        System.out.println(stringBuilder);
        
        int length = stringBuilder.length();
        stringBuilder.insert(length, "E");
        System.out.println(stringBuilder);
    }
}
