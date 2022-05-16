package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        HashSet<String> products = new HashSet();
        products.add("egg");
        products.add("milk");

        Producer producer = new Producer("ExtraFoodShop", products);

        Integer quantity = 10;

        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        return new ProductOrderRequest(producer, quantity, dateTime);

    }

}
