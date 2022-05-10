package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> map = new HashMap<>();
        map.put("Bydgoszcz",false);
        map.put("Gdańsk", true);
        map.put("Poznań", false);
        map.put("Warszawa", true);
        Optional.ofNullable(map.get(flight.getDepartureAirport()))
                .orElseThrow(() -> new RouteNotFoundException("Nie ma na rozkładzie takiego lotniska!"));
        for (Map.Entry<String,Boolean> entry: map.entrySet()) {
            if (entry.getKey().equals(flight.getDepartureAirport()) && !entry.getValue()) {
                throw new RouteNotFoundException("Nie polecisz z tego lotniska!");
            }
        }
        System.out.println("Miłej podróży!");
    }

}
