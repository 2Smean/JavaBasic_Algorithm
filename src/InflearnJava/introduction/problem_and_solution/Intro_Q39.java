package InflearnJava.introduction.problem_and_solution;
/*평균값 리펙토링*/
public class Intro_Q39 {
    public static void main(String[] args) {

        System.out.println("평균값: " + average(1,2,3));

        System.out.println("평균값: " + average(15,25,35));

        System.out.println("-----------------------------------------");

        average(1, "hello"); // 두 메서드는 다른 메서드이다
        average("hello", 2);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0 ;
    }

    public static void average(int a, String b) {
        System.out.println("int a , String b");
    }

    public static void average(String a, int b) {
        System.out.println("Stringa a , int b");
    }
}
