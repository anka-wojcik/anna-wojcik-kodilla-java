package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopRepository implements SupplierOrderRepository {

    @Override
    public boolean createOrder(CustomerOrderRequest customerOrderRequest) {
        if(customerOrderRequest.getSupplier().equals(SupplierGlutenFreeShop.class.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
