package com.kodilla.good.patterns.challenges.flightservice;

public class Application {

    public static void main(String[] args) {
        FlightCenter flightCenter = new FlightCenter();
        flightCenter.flightFrom(TownEnum.POZNAN);
        flightCenter.flightTo(TownEnum.GDANSK);
        flightCenter.flightFromTo(TownEnum.WARSZAWA, TownEnum.POZNAN);
    }
}
