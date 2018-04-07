package com.kodilla.good.patterns.challenges.food2door;

public class CustomerOrderRequestRetriever {

    public CustomerOrderRequest retrieve() {
        Customer customer = new Customer("John", "Smith");
        Supplier supplier = new SupplierExtraFoodShop();
        String product = "Wedel chocolate";
        Integer amount = 4;

        return new CustomerOrderRequest(customer, supplier, product, amount);
    }
}
