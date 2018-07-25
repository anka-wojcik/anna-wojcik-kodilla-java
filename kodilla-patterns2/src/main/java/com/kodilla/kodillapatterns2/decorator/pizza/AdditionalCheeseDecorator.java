package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getOrderCost() {
        return super.getOrderCost().add(new BigDecimal(2));
    }

    @Override
    public String getOrderDescription() {
        return super.getOrderDescription() + ", extra cheese";
    }
}
