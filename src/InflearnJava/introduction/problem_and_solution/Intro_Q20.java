package InflearnJava.introduction.problem_and_solution;
/*중첩 for 문으로 구구단을 출력하라
* 바깥 for문은 1 - 9 를 9번
* 내부 for문은 123456789를 9번 */
public class Intro_Q20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j );
            }
        }
    }
}
