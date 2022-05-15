package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderRequest {

    private Producer producer;
    private Integer quantity;
    private String dateTime;

    public ProductOrderRequest (final Producer producer, final Integer quantity, final String dateTime) {
        this.producer = producer;
        this.quantity = quantity;
        this.dateTime = dateTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getDateTime() {
        return dateTime;
    }
}
