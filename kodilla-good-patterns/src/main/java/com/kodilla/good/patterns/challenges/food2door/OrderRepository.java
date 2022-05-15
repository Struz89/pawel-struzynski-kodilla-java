package com.kodilla.good.patterns.challenges.food2door;

public interface OrderRepository {
    void createOrder(Producer producer, Integer quantity, String dateTime);
}
