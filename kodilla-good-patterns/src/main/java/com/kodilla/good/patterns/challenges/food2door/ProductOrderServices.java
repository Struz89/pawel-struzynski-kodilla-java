package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderServices implements OrderService {

    @Override
    public boolean order(Producer producer, Integer quantity, String dateTime) {
        if (producer.getProducer() != null) {
            System.out.println("Producer: " + producer.getProducer()
                    + "," + " product: " + producer.getProductName() + "," + " quantity: " + quantity
                    + "," + " date: " + dateTime);
            return true;
        } else {
            System.out.println(producer.getAnnouncement());
            return false;
        }
    }
}
