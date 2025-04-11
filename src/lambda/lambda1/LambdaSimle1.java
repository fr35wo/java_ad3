package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimle1 {
    public static void main(String[] args) {
        MyFunction function1 = (int a, int b) -> a + b;

        MyFunction function2 = (int a, int b) -> {
            System.out.println(function1.apply(a, b));
            return a + b;
        };

        MyFunction myFunction = (int a, int b) -> a + b;

        MyFunction function3 = (a,b) -> a+b;

        MyCall myCall = (int value) -> value * 2;

    }

    interface MyCall {
        int call(int value);
    }
}
