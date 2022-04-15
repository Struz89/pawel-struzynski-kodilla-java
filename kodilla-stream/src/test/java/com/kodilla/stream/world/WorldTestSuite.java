package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        World world = new World();

        // When
        world.addCountriesAndContinents(new Continent(Arrays.asList(new Country("Poland", new BigDecimal("211111110903703703670"))), "Europe"));
        world.addCountriesAndContinents(new Continent(Arrays.asList(new Country("England", new BigDecimal("211111110903703703670"))), "Europe"));

        // Then
        Assertions.assertEquals(100,world.getPeopleQuantity());

    }

}
