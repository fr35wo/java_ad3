package lambda.lambda3;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = new StringFunction() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result1 = upperCase.apply("hello");

        NumberFunction square = n -> n * n;
        Integer result2 = square.apply(3);

    }

    @FunctionalInterface
    interface StringFunction{
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction{
        Integer apply(Integer s);
    }

}
