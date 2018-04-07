package com.kodilla.good.patterns.challenges.food2door;

public class CustomerOrderProcessor {

    public void processOrder(CustomerOrderRequest customerOrderRequest) {
        customerOrderRequest.getSupplier().process(customerOrderRequest);
        if(customerOrderRequest.getSupplier().process(customerOrderRequest).isOrdered) {
            System.out.println("Ordering successful: " + customerOrderRequest.getSupplier() + " " + customerOrderRequest.getProduct() + ", amount: " + customerOrderRequest.getAmount() + ", for: " + customerOrderRequest.getCustomer());
        } else {
            System.out.println("Your order could not be processed.");
        }
    }
}
