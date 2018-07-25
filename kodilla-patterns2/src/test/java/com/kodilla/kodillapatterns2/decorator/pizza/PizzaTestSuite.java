package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static com.kodilla.kodillapatterns2.decorator.pizza.AdditionalIngredientsDecorator.*;
import static org.junit.Assert.*;

public class PizzaTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizza.getOrderCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        //When
        String description = pizza.getOrderDescription();
        //Then
        assertEquals("Pizza, ingr.: tomato sauce, cheese", description);
    }

    @Test
    public void testPizzaOrderExtraCheeseGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new AdditionalCheeseDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getOrderCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testPizzaOrderExtraCheeseGetDescription() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new AdditionalCheeseDecorator(pizza);
        //When
        String description = pizza.getOrderDescription();
        //Then
        assertEquals("Pizza, ingr.: tomato sauce, cheese, extra cheese", description);
    }

    @Test
    public void testPizzaOrderAdditionalIngredientsExtraCheeseGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new AdditionalIngredientsDecorator(pizza, Ingredients.OLIVES);
        pizza = new AdditionalIngredientsDecorator(pizza, Ingredients.SHRIMPS);
        pizza = new AdditionalCheeseDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getOrderCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testPizzaOrderAdditionalIngredientsExtraCheeseGetDescription() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new AdditionalIngredientsDecorator(pizza, Ingredients.OLIVES);
        pizza = new AdditionalIngredientsDecorator(pizza, Ingredients.SHRIMPS);
        pizza = new AdditionalCheeseDecorator(pizza);
        //When
        String description = pizza.getOrderDescription();
        //Then
        assertEquals("Pizza, ingr.: tomato sauce, cheese, olives, shrimps, extra cheese", description);
    }

}
