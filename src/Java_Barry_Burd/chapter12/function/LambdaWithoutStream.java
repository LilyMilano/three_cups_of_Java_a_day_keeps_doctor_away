package Java_Barry_Burd.chapter12.function;

import java.util.function.Function;

public class LambdaWithoutStream {
    public static void main(String[] args) {
        System.out.println(change("Hello", (String a) -> {return a + "!";}));
        // Output: Hello!
    }
    static String change(String str, Function<String, String> func){
        return func.apply(str);
    }
}
