package com.kodilla.good.patterns.challenges.food2door;

public abstract class Supplier {
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract CustomerOrderDto process(CustomerOrderRequest customerOrderRequest);

    @Override
    public String toString() {
        return name;
    }
}
