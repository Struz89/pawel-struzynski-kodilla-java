package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("classic")
                .burgers(3)
                .sauce("standard")
                .ingredient("bacon")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();

        //When
        int ingredients = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(4,ingredients);
    }

}
