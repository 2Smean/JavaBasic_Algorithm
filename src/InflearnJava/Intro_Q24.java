package InflearnJava;

import java.util.Scanner;

/*음식과 가격 개수를 입력 받고 이에 대한 계산서를 발급*/
public class Intro_Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음식의 이름을 입력하세요");
        String foodName = sc.next();
        System.out.println("음식의 가격을 입력하세요");
        int foodPrice = sc.nextInt();
        System.out.println("수량을 입력해주세요");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + foodQuantity + "개를 주문하셨습니다." + " 총 가격은 " + totalPrice + "입니다.");
    }
}
