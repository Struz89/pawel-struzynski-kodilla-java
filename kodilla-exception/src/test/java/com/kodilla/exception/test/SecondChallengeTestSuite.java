package com.kodilla.exception.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
    @Test
    void testXMoreThanTwoAndYNotEqualOneFive() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1,1));
    }

    @Test
    void testXEqualTwoAndYNotEqualOneFive() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1));
    }

    @Test
    void testXLessThanOneAndYNotEqualOneFive() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99,1));
    }

    @Test
    void testXEqualOneAndYNotEqualOneFive() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1));
    }

    @Test
    void testXEqualOneAndYEqualOneFive() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5));
    }

}
