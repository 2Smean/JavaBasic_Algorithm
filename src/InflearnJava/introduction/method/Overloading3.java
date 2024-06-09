package InflearnJava.introduction.method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(2, 3)); // 본인의 타입에 적합한 메서드를 호출하고 적합한게 없다면 형변환가능한 타입의 메서드를 찾아서 실행한다.
        System.out.println("2: " + add(1.2, 2.4));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
