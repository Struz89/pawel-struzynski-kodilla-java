package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class Continent {

    private final List<Country> country;

    private final String nameContinent;

    public Continent(final List<Country> country, final String nameContinent) {
        this.country = country;
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity(Country country) {
        return country.getPeopleQuantity();
    }

}
