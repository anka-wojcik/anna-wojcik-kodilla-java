package com.kodilla.good.patterns.challenges.food2door;

public class CustomerOrderDto {
    public Customer customer;
    public boolean isOrdered;

    public CustomerOrderDto(Customer customer, boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
