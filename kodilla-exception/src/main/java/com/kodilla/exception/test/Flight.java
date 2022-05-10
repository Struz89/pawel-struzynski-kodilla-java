package com.kodilla.exception.test;

import java.util.Date;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public static void main (String[] args) {
        try {
            FindFlight flight = new FindFlight();
            flight.findFlight(new Flight("Bydgoszcz", "Kraków"));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println(new Date());
        }
    }

}
