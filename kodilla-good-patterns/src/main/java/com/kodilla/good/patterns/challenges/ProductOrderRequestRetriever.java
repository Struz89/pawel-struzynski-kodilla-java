package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        User user = new User("Jan", "Kowalski");

        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        String product = "kalesony";

        return new ProductOrderRequest(user, dateTime, product);
    }

}
