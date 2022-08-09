package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {

    private User user;
    private Supplier supplier;
    private int quantityOfProduct;
    private Product product;

    public Order(User user,Supplier supplier, int quantityOfProduct, Product product) {
        this.user = user;
        this.supplier = supplier;
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;
    }

    public User getUser(){
        return user;
    }
    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public Product getProduct() {
        return product;
    }
}
