package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        World world = new World();

        // When
        List<Country> countryListEurope = new ArrayList<>();
        List<Country> countryListAsia = new ArrayList<>();
        List<Country> countryListAfrica = new ArrayList<>();
        countryListEurope.add(new Country("Poland", new BigDecimal("211111110903703703670")));
        countryListEurope.add(new Country("England", new BigDecimal("211111110903703703670")));
        countryListAsia.add(new Country("Vietnam", new BigDecimal("211111110903703703670")));
        countryListAsia.add(new Country("Thailand", new BigDecimal("211111110903703703670")));
        countryListAfrica.add(new Country("Senegal", new BigDecimal("211111110903703703670")));
        countryListAfrica.add(new Country("Nigeria", new BigDecimal("211111110903703703670")));
        world.addCountriesAndContinents(new Continent(countryListEurope, "Europe"));
        world.addCountriesAndContinents(new Continent(countryListAsia, "Asia"));
        world.addCountriesAndContinents(new Continent(countryListAfrica, "Africa"));

        // Then
        Assertions.assertEquals(new BigDecimal("1266666665422222222020"),world.getPeopleQuantity());

    }

}
