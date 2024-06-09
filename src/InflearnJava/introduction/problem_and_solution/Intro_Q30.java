package InflearnJava.introduction.problem_and_solution;

import java.util.Scanner;

public class Intro_Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 :");
//        while (true) {
//            int num = sc.nextInt();
//
//            if (num == -1) {
//                break;
//            }
//            sum += num;
//            count++;
//        }

        while ((num = sc.nextInt()) != -1) { // 최적화 코드
            sum += num;
            count++;
        }

        double average =(double) sum / count;
        System.out.println("입력한 숫자들의 합계 = " + sum);
        System.out.println("입력한 숫자들의 평균 = " + average);
    }

    public static class Intro_Q31 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int totalCost = 0;

            while (true) {
                System.out.println("1 : 상품입력 , 2 : 결제 , 3 : 프로그램종료");
                int option = sc.nextInt();
                if (option == 1) {
                    sc.nextLine();

                    System.out.println("상품명을 입력하세요");
                    String name = sc.next();
                    System.out.println("상품 가격을 입력하세요");
                    int price = sc.nextInt();
                    System.out.println("구매 수량을 입력하세요");
                    int quantity = sc.nextInt();

                    totalCost += price * quantity;

                    System.out.println("상품명: " + name + "가격 " + price + "합계 " + price * quantity);
                } else if (option == 2) {
                    System.out.println("총 비용: " + totalCost);
                } else if (option == 3) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                } else {
                    System.out.println("다시 입력하세요");
                }
            }
        }
    }
}
