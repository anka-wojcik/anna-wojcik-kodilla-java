package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalIngredientsDecorator extends AbstractPizzaOrderDecorator {

    public enum Ingredients {
        MUSHROOMS("muschrooms", "2"),
        BEACON("beacon", "3"),
        LETTUCE("lettuce", "1"),
        SHRIMPS("shrimps", "4"),
        OLIVES("olives", "2");

        String name;
        BigDecimal cost;

        Ingredients(String name, String ingredientCost) {
            this.name = name;
            this.cost = new BigDecimal(ingredientCost);
        }

        public String toString() {
            return name;
        }

        public BigDecimal getIngredientCost() {
            return cost;
        }
    }

    private Ingredients ingredients;

    public AdditionalIngredientsDecorator(Pizza pizza, Ingredients ingredients) {
        super(pizza);
        this.ingredients = ingredients;
    }

    @Override
    public BigDecimal getOrderCost() {
        return super.getOrderCost().add(ingredients.getIngredientCost());
    }

    @Override
    public String getOrderDescription() {
        return super.getOrderDescription() + ", " + ingredients;
    }
}
