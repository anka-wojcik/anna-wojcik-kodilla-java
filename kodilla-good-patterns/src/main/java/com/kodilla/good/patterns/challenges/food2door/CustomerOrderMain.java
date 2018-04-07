package com.kodilla.good.patterns.challenges.food2door;


public class CustomerOrderMain {
    public static void main(String[] args) {
        CustomerOrderRequestRetriever customerOrderRequestRetriever = new CustomerOrderRequestRetriever();
        CustomerOrderRequest customerOrderRequest = customerOrderRequestRetriever.retrieve();

        CustomerOrderProcessor customerOrderProcessor = new CustomerOrderProcessor();
        customerOrderProcessor.processOrder(customerOrderRequest);
    }
}
