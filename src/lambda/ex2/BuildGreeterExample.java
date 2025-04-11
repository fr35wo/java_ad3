package lambda.ex2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return input -> greeting + ", " + input;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("Hello");
        StringFunction hiGreeter = buildGreeter("Hi");

        System.out.println(helloGreeter.apply("Java"));
        System.out.println(hiGreeter.apply("Lambda"));
    }
}
