package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> countriesAndContinents = new ArrayList<>();

    public void addCountriesAndContinents(Continent continent) {
        countriesAndContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return countriesAndContinents.stream()
                .flatMap(continent -> continent.getCountry().stream().map(Country::getPeopleQuantity))
//        .map(Continent::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }

}
