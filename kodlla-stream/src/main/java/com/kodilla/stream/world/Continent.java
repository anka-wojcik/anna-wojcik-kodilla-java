package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> listOfCountriesOnContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        listOfCountriesOnContinent.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountriesOnContinent() {
        return listOfCountriesOnContinent;
    }
}
