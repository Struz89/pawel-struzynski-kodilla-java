package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ProductOrderServices(), new ProductOrderRepository());
        productOrderService.process(productOrderRequest);
    }

}
