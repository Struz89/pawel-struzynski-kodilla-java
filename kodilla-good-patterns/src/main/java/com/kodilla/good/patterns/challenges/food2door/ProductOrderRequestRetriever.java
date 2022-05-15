package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        Producer producer = new Producer("egg");

        Integer quantity = 10;

        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        return new ProductOrderRequest(producer, quantity, dateTime);

    }

}
