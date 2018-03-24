package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }

    public List<String> getCountriesList() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .map(Country::getCountryName)
                .collect(Collectors.toList());
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
