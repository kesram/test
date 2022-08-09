package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.*;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;


    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public ShopOrderDto process(final ShopOrderRequest shopOrderRequest) {
        boolean isOrdered = orderService.shopOrder(shopOrderRequest.getUser(), shopOrderRequest.getSupplier(),
                shopOrderRequest.getQuantityOfProduct(), shopOrderRequest.getProduct());
        if (isOrdered) {
            informationService.inform(shopOrderRequest.getUser());
            orderRepository.createOrder(shopOrderRequest.getUser(), shopOrderRequest.getSupplier(),
                    shopOrderRequest.getQuantityOfProduct(), shopOrderRequest.getProduct());
            return new ShopOrderDto(shopOrderRequest.getUser(), true);
        } else {
            return new ShopOrderDto(shopOrderRequest.getUser(), false);
        }
    }
}
