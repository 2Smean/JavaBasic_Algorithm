package HwangJava.Example;

import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("커피를 주문하세요 1.에스프레소 2.카푸치노 3.카페라떼 price = 3500 4.아메리카노 price = 2000");
        String order = sc.next();
        int price = 0;
        switch (order) {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("없는 메뉴입니다");
        }
        if (price != 0) {//조건을 주는 이유는 없는 메뉴의 가격은 정보가 없기 때문이다
            System.out.println(order + "는 " + price + "원입니다");
        }
    }
}
