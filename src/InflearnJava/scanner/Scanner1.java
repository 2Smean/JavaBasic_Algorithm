package InflearnJava.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = sc.nextLine();
        System.out.println("입력 받은 문자열은 " + str + "입니다.");

        System.out.print("정수를 입력하세요:");
        int intValue = sc.nextInt();
        System.out.println("입력 받은 정수는 " + intValue + "입니다.");

        System.out.print("실수를 입력하세요:");
        double doubleValue = sc.nextDouble();
        System.out.println("입력 받은 실수는 " + doubleValue + "입니다.");
    }
}
