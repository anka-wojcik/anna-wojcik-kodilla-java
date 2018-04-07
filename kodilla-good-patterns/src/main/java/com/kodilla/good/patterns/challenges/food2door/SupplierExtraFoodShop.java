package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class SupplierExtraFoodShop extends Supplier {

    private Map<String, Integer> availableProducts = new HashMap<>();

    public SupplierExtraFoodShop() {
        super("Extra Food Shop");
    }

    public Map<String, Integer> createAvailableProducts() {
        availableProducts.put("Wedel chocolate", 40);
        availableProducts.put("Wawel chocolate", 14);
        availableProducts.put("Goplana chocolate", 7);
        availableProducts.put("Lindt chocolate", 2);

        return availableProducts;
    }

    @Override
    public CustomerOrderDto process(CustomerOrderRequest customerOrderRequest) {
        createAvailableProducts();
        if (availableProducts.containsKey(customerOrderRequest.getProduct()) && availableProducts.get(customerOrderRequest.getProduct()) >= customerOrderRequest.getAmount()) {
            availableProducts.put(customerOrderRequest.getProduct(), availableProducts.get(customerOrderRequest.getProduct()) - customerOrderRequest.getAmount());
            return new CustomerOrderDto(customerOrderRequest.getCustomer(), true);
        } else {
            return new CustomerOrderDto(customerOrderRequest.getCustomer(), false);
        }
    }
}
