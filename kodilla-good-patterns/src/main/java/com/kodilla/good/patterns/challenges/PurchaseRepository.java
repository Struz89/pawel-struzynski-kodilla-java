package com.kodilla.good.patterns.challenges;

public interface PurchaseRepository {
    void createPurchase(User user, String dateTime, String product);
}
