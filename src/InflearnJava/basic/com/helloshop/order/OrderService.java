package InflearnJava.basic.com.helloshop.order;

import InflearnJava.basic.com.helloshop.product.Product;
import InflearnJava.basic.com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
