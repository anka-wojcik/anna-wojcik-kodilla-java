package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements Pizza {
    private final Pizza pizza;

    protected AbstractPizzaOrderDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getOrderCost() {
        return pizza.getOrderCost();
    }

    @Override
    public String getOrderDescription() {
        return pizza.getOrderDescription();
    }
}
