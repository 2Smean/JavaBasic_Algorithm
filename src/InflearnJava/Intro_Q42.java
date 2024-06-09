package InflearnJava;

import java.util.Scanner;

public class Intro_Q42 {
    public static void main(String[] args) {
        int balance = 0; // 값이 저장되는 변수
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택: ");
            int option = sc.nextInt();
            int amount;

            switch (option) {
                case 1:
                    System.out.println("입금액을 입력하세요");
                    amount = sc.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요");
                    amount = sc.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액은 " + balance + "원");
                    break; //switch 문을 빠져나감
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; // main 메서드 종료 즉, 프로그램이 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
