package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.*;

public class Application {
    public static void main(String[] args) {
        ShopOrderRetriever shopOrderRetriever = new ShopOrderRetriever();
        ShopOrderRequest shopOrderRequest = shopOrderRetriever.retrieve();

        ShopOrderProcessor shopOrderProcessor = new ShopOrderProcessor(
                new ShopMailService(), new ShopOrderService(), new ShopOrderRepository());
        shopOrderProcessor.process(shopOrderRequest);
    }
}