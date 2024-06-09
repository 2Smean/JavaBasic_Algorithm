package InflearnJava.introduction.question;

import java.util.Scanner;

//사용자로 부터 하나의 정수를 입력 받고 홀 짝 구분하는
public class Intro_Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요");
        int num = scanner.nextInt();

        if (num%2 ==0) {
            System.out.println("입력하신 정수"+num+"는 짝수 입니다");
        } else if (num%2 == 1) {
            System.out.println("입력하신 정수"+num+"는 홀수 입니다");
        }
    }
}
