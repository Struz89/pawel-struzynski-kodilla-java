package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    void testGetAverage() {
        // Given
        int[] array = new int[20];

        // When
        double average = ArrayOperations.getAverage(array);

        // Then
        Assertions.assertEquals(9.5,average);

    }

}
