package InflearnJava.basic.ref.Ex;

import java.util.Scanner;

/*개수를 입력받기*/
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int option = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[option];

        for (int i = 0; i < orders.length; i++) {
            System.out.print((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String name = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();

            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(name, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders); // 반환타입에 맞게 값을 받아주는 단축키 = option + command + v
        System.out.println("총 결제 금액: " + totalAmount);

    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
