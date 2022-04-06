package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> array = new ArrayList<>();
        for (Integer number: numbers) {
            if (number != null && number % 2 == 0) {
                array.add(number);
            }
        }
        return array;
    }

}
