package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements ShopOrderService{
    @Override
    public boolean process(Order order) {
        System.out.println("Are You allergic to gluten? Come to us!");
        return true;
    }
}
