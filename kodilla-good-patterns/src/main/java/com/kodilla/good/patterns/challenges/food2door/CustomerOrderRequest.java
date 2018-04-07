package com.kodilla.good.patterns.challenges.food2door;


public class CustomerOrderRequest {
    private Customer customer;
    private Supplier supplier;
    private String product;
    private Integer amount;

    public CustomerOrderRequest(Customer customer, Supplier supplier, String product, Integer amount) {
        this.customer = customer;
        this.supplier = supplier;
        this.product = product;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public Integer getAmount() {
        return amount;
    }
}
