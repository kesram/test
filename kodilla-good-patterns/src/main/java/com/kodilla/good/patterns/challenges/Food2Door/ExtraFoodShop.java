package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements ShopOrderService{
    @Override
    public boolean process(Order order) {
        System.out.println("Thank You for choosing us! Best Extra Food Shop!\n make shopping extra again!");
        return true;
    }
}
