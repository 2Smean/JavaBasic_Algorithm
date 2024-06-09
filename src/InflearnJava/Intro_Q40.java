package InflearnJava;

public class Intro_Q40 {
    public static void main(String[] args) { //메서드를 사용하면 코드의 중복을 줄일 수 있다.
        String message = "Hello, world!";

        printMessage("Hello, world", 3);
        printMessage("java", 5);
        printMessage("hi", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
        return;
    }
}
