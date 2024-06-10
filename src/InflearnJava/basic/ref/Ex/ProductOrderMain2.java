package InflearnJava.basic.ref.Ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        printOrders(productOrders);

        int totalAmount = getTotalAmount(productOrders); // 반환타입에 맞게 값을 받아주는 단축키 = option + command + v
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
