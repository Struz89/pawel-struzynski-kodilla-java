package com.kodilla.good.patterns.challenges.flightservice;

import java.time.LocalDateTime;
import java.util.*;

public class FlightCenter {

    private Set<Flight> flights = new HashSet<>();

    public void flightFrom(TownEnum townEnum) {
        flights.stream()
                .filter(departure -> departure.getDeparture().equals(townEnum))
                .map(Flight::getArrival)
                .forEach(System.out::println);

    }

    public void flightTo(TownEnum townEnum) {
        flights.stream()
                .filter(arrival -> arrival.getArrival().equals(townEnum))
                .map(Flight::getDeparture)
                .forEach(System.out::println);

    }

    public void flightFromTo(TownEnum townEnumDeparture, TownEnum townEnumArrival) {
        for (Flight flight1 : flights) {
            if (flight1.getDeparture().equals(townEnumDeparture) && flight1.getArrival().equals(townEnumArrival)) {
                System.out.println("Istnieje połącznie: " + flight1.getDeparture() + "-" + flight1.getArrival());
            } else if (flight1.getDeparture().equals(townEnumDeparture)) {
                TownEnum throughTown = flight1.getArrival();
                for (Flight flight2 : flights) {
                    if (flight2.getDeparture().equals(throughTown) && flight2.getArrival().equals(townEnumArrival)) {
                        System.out.println("Istnieje połączenie: " + flight1.getDeparture() + "-"
                        + flight2.getDeparture() + "-" + flight2.getArrival());
                    }
                }
            }
        }
    }

    public FlightCenter() {
        flights.add(new Flight(TownEnum.WARSZAWA, TownEnum.GDANSK,
                LocalDateTime.of(2022,05,19,10,10)));
        flights.add(new Flight(TownEnum.POZNAN, TownEnum.WROCLAW,
                LocalDateTime.of(2022,05,19,16,10)));
        flights.add(new Flight(TownEnum.GDANSK, TownEnum.POZNAN,
                LocalDateTime.of(2022,05,19,22,10)));
    }
}
