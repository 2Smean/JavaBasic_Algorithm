package InflearnJava;

import java.util.Scanner;

/*구구단 출력 문제*/
public class Intro_Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단의 단수를 입력하세요");
        int n = sc.nextInt();

        System.out.println(n + "단의 구구단 :");

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
