package InflearnJava;
/*홀수 짝수 찾기

정수 x가 주어진다. x가 짝수이면 "짝수"를, 홀수이면 "홀수"를 출력하는 프로그램을 작성하자

삼항 연산자를 사용해야 한다

참고로 x % 2 를 사용하면 홀수, 짝수를 쉽게 계산할 수 있다.*/
public class Intro_Q13 {
    public static void main(String[] args) {
        int x = 8;

        String oddeven = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println(oddeven);
    }
}
