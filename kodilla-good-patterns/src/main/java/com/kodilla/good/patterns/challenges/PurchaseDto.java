package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    private User user;
    private boolean isPurchase;

    public PurchaseDto (final User user, final boolean isPurchase) {
        this.user = user;
        this.isPurchase = isPurchase;
    }

    public User getUser() {
        return user;
    }

    public boolean isPurchase() {
        return isPurchase;
    }
}
