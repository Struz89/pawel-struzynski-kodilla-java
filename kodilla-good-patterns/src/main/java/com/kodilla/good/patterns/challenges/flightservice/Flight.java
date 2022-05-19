package com.kodilla.good.patterns.challenges.flightservice;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {

    private TownEnum departure;
    private TownEnum arrival;
    private LocalDateTime dateTimeFlight;

    public Flight(TownEnum departure, TownEnum arrival, LocalDateTime dateTimeFlight) {
        this.departure = departure;
        this.arrival = arrival;
        this.dateTimeFlight = dateTimeFlight;
    }

    public TownEnum getDeparture() {
        return departure;
    }

    public TownEnum getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departure == flight.departure && arrival == flight.arrival && Objects.equals(dateTimeFlight, flight.dateTimeFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, dateTimeFlight);
    }
}
