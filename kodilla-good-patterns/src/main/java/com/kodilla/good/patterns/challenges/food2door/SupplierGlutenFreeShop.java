package com.kodilla.good.patterns.challenges.food2door;

public class SupplierGlutenFreeShop extends Supplier {

    private SupplierOrderRepository orderRepository;

    public SupplierGlutenFreeShop() {
        super("GlutenFree Shop");
        this.orderRepository = orderRepository;
    }

    @Override
    public CustomerOrderDto process(CustomerOrderRequest customerOrderRequest) {
        boolean createdOrder = orderRepository.createOrder(customerOrderRequest);
        if(createdOrder) {
            return new CustomerOrderDto(customerOrderRequest.getCustomer(), true);
        } else {
            return new CustomerOrderDto(customerOrderRequest.getCustomer(), false);
        }
    }
}
