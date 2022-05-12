package com.kodilla.good.patterns.challenges;

public class ProductOrderRequest {

    public User user;
    public String dateTime;
    public String product;

    public ProductOrderRequest (final User user, final String dateTime, final String product) {
        this.user = user;
        this.dateTime = dateTime;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getProduct() {
        return product;
    }
}
