package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;

public class Producer {

    private String producerName;
    private HashSet<String> products;

    public Producer (String producerName, HashSet<String> products) {
        this.producerName = producerName;
        this.products = products;
    }

    public String getProducerName() {
        return producerName;
    }

    public HashSet getProducts() {
        return products;
    }
}
