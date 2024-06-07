package InflearnJava;

import java.util.Scanner;

public class Intro_Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) { // i 가 마지막이 아니면
                System.out.print(",");
            }
        }
    }
}
