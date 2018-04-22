package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .bun("sesame bun")
                .sauce("spicy")
                .ingredient("onion")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.ingredients.size();

        //Given
        Assert.assertEquals(2, howManyIngredients);

    }
}
