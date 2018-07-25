package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements Pizza {

    @Override
    public BigDecimal getOrderCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getOrderDescription() {
        return "Pizza, ingr.: tomato sauce, cheese";
    }
}
