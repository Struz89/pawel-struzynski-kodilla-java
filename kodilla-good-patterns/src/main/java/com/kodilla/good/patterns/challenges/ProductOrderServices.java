package com.kodilla.good.patterns.challenges;

public class ProductOrderServices implements PurchaseService{

    @Override
    public boolean purchase(User user, String dateTime, String product) {
        System.out.println("Buyer login: " + user.getName() + user.getSurname()
                + "," + " date: " + dateTime.toString() + "," + " product: " + product);

        return true;
    }
}
