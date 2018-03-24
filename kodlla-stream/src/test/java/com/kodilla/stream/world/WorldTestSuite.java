package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testWorldGetPeopleQuantity(){
        //Given
            //Create countries and continents
        Country japan = new Country("Japan", new BigDecimal("897458774558665"));
        Country singapore = new Country("Singapore", new BigDecimal("897458774558667"));
        Country china = new Country("China", new BigDecimal("897458774558660"));
        Country poland = new Country("Poland", new BigDecimal("897458774558647"));
        Country denmark = new Country("Denmark", new BigDecimal("897458774558598"));

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");

        //When
            //Adding countries to continents and continents to world
        asia.addCountry(japan);
        asia.addCountry(singapore);
        asia.addCountry(china);
        europe.addCountry(poland);
        europe.addCountry(denmark);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);

        //Then
            //There are 2 continents, one with 2 countries and one with 3 countries assigned to it = expected 5 countries on the list
        Assert.assertEquals(5, world.getCountriesList().size());
            //Testing total people quantity
        BigDecimal expectedPeopleQuantity = new BigDecimal("4487293872793237");
        Assert.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());





    }
}
