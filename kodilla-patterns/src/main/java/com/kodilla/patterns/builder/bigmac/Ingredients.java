package com.kodilla.patterns.builder.bigmac;


import java.util.Arrays;

public class Ingredients {
    final private String ingredient;
    String[] ingredientsToChhose = {"lettuce", "onion", "beacon", "cucumber", "chili peppers", "mushrooms", "shrimps", "cheese" };

    public Ingredients(String ingredient) {
       if(Arrays.asList(ingredientsToChhose).contains(ingredient)) {
           this.ingredient = ingredient;
       } else
           throw new IllegalStateException("This ingredient is not available.");
    }

    public String getIngredient() {
        return ingredient;
    }
}
