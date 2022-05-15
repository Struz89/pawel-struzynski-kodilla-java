package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class Producer {

    private final static String producer1 = "ExtraFoodShop";
    private final static String producer2 = "HealthyShop";
    private final static String producer3 = "GlutenFreeShop";

    private String producerName;
    private String announcement;
    private String productName;


    public Producer (String product) {
        Map<String, String> producer = new HashMap<>();
        producer.put("egg", producer1);
        producer.put("bread", producer2);
        producer.put("milk", producer3);
        for (Map.Entry<String,String> entry : producer.entrySet()) {
            if(entry.getKey().equals(product)) {
                producerName = entry.getValue();
                productName = entry.getKey();
            } else {
                announcement = "Nie ma takiego produktu w magazynie. Nie można zrealizować zamówienia!";
            }
        }
    }

    public String getProducer() {
        return producerName;
    }

    public String getProductName() {
        return productName;
    }

    public String getAnnouncement() {
        return announcement;
    }

}
