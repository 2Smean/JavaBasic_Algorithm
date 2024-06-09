package InflearnJava.method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); //double 이 더 큰 그릇을 가지고 있기 때문에 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
