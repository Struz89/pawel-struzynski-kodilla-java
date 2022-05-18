package com.kodilla.good.patterns.challenges.flightservice;

public class Application {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        flightService.flightsFrom("Gdańsk");
        flightService.flightsTo("Bydgoszcz");
        flightService.flightsFromTo("Poznań", "Wrocław");
    }
}
