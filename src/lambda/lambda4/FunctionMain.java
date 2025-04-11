package lambda.lambda4;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String, Integer> funcction1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(funcction1.apply("hello"));

        Function<String, Integer> function2 = s -> s.length();
        System.out.println(function2.apply("hello"));

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
 consumer.accept("hello");
    }
}
