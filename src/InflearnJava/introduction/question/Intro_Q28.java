package InflearnJava.introduction.question;

import java.util.Scanner;

public class Intro_Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료)");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("나이를 입력하세요");
            int age = sc.nextInt(); // \n이 남아서 다음 입력란에 영향을 끼친다
            sc.nextLine(); // 그래서 nextLine 으로 한번 읽고 버리는 목적으로 nextLine을 사용

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
            System.out.println();
        }
    }
}
