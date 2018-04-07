package com.kodilla.good.patterns.challenges.food2door;

public class SupplierHealthyShop extends Supplier {

    public SupplierHealthyShop() {
        super("Healthy Shop");
    }

    @Override
    public CustomerOrderDto process(CustomerOrderRequest customerOrderRequest) {
        return new CustomerOrderDto(customerOrderRequest.getCustomer(), true);
    }
}
