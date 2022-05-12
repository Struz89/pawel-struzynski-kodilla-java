package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public ProductOrderService (final InformationService informationService,
                                final PurchaseService purchaseService,
                                final PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(final ProductOrderRequest productOrderRequest) {
        boolean isPurchase = purchaseService.purchase(productOrderRequest.getUser(),productOrderRequest.getDateTime(),
                                                      productOrderRequest.getProduct());
        if(isPurchase) {
            informationService.inform(productOrderRequest.getUser());
            purchaseRepository.createPurchase(productOrderRequest.getUser(), productOrderRequest.getDateTime(), productOrderRequest.getProduct());
            return new PurchaseDto(productOrderRequest.getUser(), true);
        } else {
            return new PurchaseDto(productOrderRequest.getUser(), false);
        }
    }

}
