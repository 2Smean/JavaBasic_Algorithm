package InflearnJava;
/*int rows 를 선언해라

이 수만큼 다음과 같은 피라미드를 출력하면 된다

참고 : println() 은 출력 후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print() 사용하면 된다.

이해함 : 외부 for 문의 조건은 rows가 되는 것이고, 내부 for 문의 조건은 i가 되는 것이다 
*/
public class Intro_Q21 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }
}
