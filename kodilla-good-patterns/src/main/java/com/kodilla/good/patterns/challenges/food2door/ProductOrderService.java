package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService (final InformationService informationService,
                                final OrderService orderService,
                                final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public ProducerDto process(final ProductOrderRequest productOrderRequest) {
        boolean isProducer = orderService.order(productOrderRequest.getProducer(), productOrderRequest.getQuantity(),
                                                      productOrderRequest.getDateTime());

        if(isProducer && productOrderRequest.getProducer() != null) {
            informationService.inform(productOrderRequest.getProducer());
            orderRepository.createOrder(productOrderRequest.getProducer(), productOrderRequest.getQuantity(),
                                              productOrderRequest.getDateTime());
            return new ProducerDto(productOrderRequest.getProducer(), true);
        } else {
            return new ProducerDto(productOrderRequest.getProducer(), false);
        }
    }

}
