package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test checks if the list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        System.out.println("Test checks if the list is empty");
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();

        //When
        List<Integer> array = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(0,array.size());

    }

    @DisplayName("Test checks that the list will only return even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        System.out.println("Test checks that the list will only return even numbers");
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);

        //When
        List<Integer> array = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(2,array.size());

    }

}
