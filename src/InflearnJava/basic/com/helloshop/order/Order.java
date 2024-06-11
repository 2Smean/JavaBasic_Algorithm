package InflearnJava.basic.com.helloshop.order;

import InflearnJava.basic.com.helloshop.product.Product;
import InflearnJava.basic.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
