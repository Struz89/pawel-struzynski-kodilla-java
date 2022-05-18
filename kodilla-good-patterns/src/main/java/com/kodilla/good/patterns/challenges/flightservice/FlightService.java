package com.kodilla.good.patterns.challenges.flightservice;

import java.util.Map;

public class FlightService {

    public void flightsFrom(String departureTown) {

        FlightCenter flightCenter = new FlightCenter();
        flightCenter.getFlightMap().entrySet().stream()
                .filter(departureMap -> departureMap.getKey().equals(departureTown))
                .map(arrival -> arrival.getValue())
                .forEach(System.out::println);
    }

    public void flightsTo(String arrivalTown) {

        FlightCenter flightCenter = new FlightCenter();
        flightCenter.getFlightMap().entrySet().stream()
                .filter(departureMap -> departureMap.getValue().equals(arrivalTown))
                .map(arrivalMap -> arrivalMap.getKey())
                .forEach(System.out::println);
    }

    public void flightsFromTo(String departureTown, String arrivalTown) {

        FlightCenter flightCenter = new FlightCenter();
        for (Map.Entry<String, String> entry : flightCenter.getFlightMap().entrySet()) {
            if (entry.getKey().equals(departureTown)) {
                if (entry.getValue().equals(arrivalTown)) {
                    System.out.println("Lot: " + departureTown + "-" + arrivalTown
                            + " bez przesiadek");
                } else {
                    String transferTown = entry.getValue();
                    for (Map.Entry<String, String> entry2 : flightCenter.getFlightMap().entrySet()) {
                        if (entry2.getKey().equals(transferTown)) {
                            if (entry2.getValue().equals(arrivalTown)) {
                                System.out.println("Lot: " + departureTown + "-" + arrivalTown
                                + " z przesiadką w " + transferTown);
                            } else {
                                System.out.println("Brak połączenia: " + departureTown + "-" + arrivalTown);
                            }
                        }
                    }
                }
            }
        }
    }
}
