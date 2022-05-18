package com.kodilla.good.patterns.challenges.flightservice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightCenter {

    Map<String,String> flightMap;

    public FlightCenter() {
        flightMap = new HashMap<>();
        flightMap.put("Gdańsk", "Warszawa");
        flightMap.put("Warszawa", "Bydgoszcz");
        flightMap.put("Bydgoszcz", "Wrocław");
        flightMap.put("Wrocław", "Poznań");
    }

    public Map<String, String> getFlightMap() {
        return flightMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightCenter that = (FlightCenter) o;
        return Objects.equals(flightMap, that.flightMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightMap);
    }
}
