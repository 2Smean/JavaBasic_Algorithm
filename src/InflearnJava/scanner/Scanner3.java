package InflearnJava.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하세요 (exit : 종료):");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println();
        }
    }
}
