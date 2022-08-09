package com.kodilla.good.patterns.challenges.Food2Door;

public class NewShop implements ShopOrderService{
    @Override
    public boolean process(Order order) {
        System.out.println("This is the newest shop in town!");
        return true;
    }
}
