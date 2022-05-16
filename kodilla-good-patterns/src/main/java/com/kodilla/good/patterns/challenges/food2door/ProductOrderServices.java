package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderServices implements OrderService {

    @Override
    public boolean order(Producer producer, Integer quantity, String dateTime) {
            System.out.println("Producer: " + producer.getProducerName()
                    + "," + " product: " + producer.getProducts() + "," + " quantity: " + quantity
                    + "," + " date: " + dateTime);
            return true;
    }
}
