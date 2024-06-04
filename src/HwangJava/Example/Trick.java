package HwangJava.Example;

import java.util.Scanner;

public class Trick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다 가위, 바위, 보 중 입력하세요");

        System.out.println("철수 차례");
        String ch = sc.next();
        System.out.println("영희 차례");
        String yh = sc.next();

        if (ch.equals("가위")) {
            if (yh.equals("보")) {
                System.out.println("철수가 이겼습니다");
            } else if (yh.equals("바위")) {
                System.out.println("영희가 이겼습니다");
            } else {
                System.out.println("비겼습니다");
            }
        } else if (ch.equals("바위")) {
            if (yh.equals("가위")) {
                System.out.println("철수가 이겼습니다");
            } else if (yh.equals("보")) {
                System.out.println("영희가 이겼습니다");
            } else {
                System.out.println("비겼습니다");
            }
        } else if (ch.equals("보")) {
            if (yh.equals("바위")) {
                System.out.println("철수가 이겼습니다");
            } else if (yh.equals("가위")) {
                System.out.println("영희가 이겼습니다");
            } else {
                System.out.println("비겼습니다");
            }
        }

    }
}
