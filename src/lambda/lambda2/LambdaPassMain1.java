package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain1 {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        calculate(add);
        calculate(sub);

        calculate((a,b) -> a + b);
        calculate((a,b) -> a - b);
    }

    static void calculate(MyFunction myFunction) {
        int a = 1;
        int b = 2;

        int result = myFunction.apply(a, b);
    }
}
