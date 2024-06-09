package InflearnJava.introduction.method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산 1
        int sum1 = add(5, 10);

        System.out.println("결과1 출력 : " + sum1);

        System.out.println("======================");

        //계산 2
        int sum2 = add(15, 20);

        System.out.println("결과2 출력 : " + sum2);

        System.out.println();

        add(100, 200); //반환 값을 받지 않고 호출만하고 싶을 때 // void 의 경우에는 불가
    }

    // add 메서드 Java에서는 함수를 메서드라고 한다
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산수행");
        int sum = a + b;
        return sum;
    }
}
