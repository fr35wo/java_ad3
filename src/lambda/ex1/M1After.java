package lambda.ex1;

public class M1After {
    public static void greetHi(String hi) {
        System.out.println("=== 시작 ===");
        System.out.println(hi);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greetHi("Good Morning!");
        greetHi("Good Afternoon!");
        greetHi("Good Evening!");
    }
}
