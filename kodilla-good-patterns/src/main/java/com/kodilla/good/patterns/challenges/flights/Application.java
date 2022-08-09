package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        List<Flight> departureAirport = flightSearch.departureSearch("WARSZAWA");
        departureAirport.forEach(System.out::println);

        List<Flight> arrivalAirport = flightSearch.arrivalSearch("MIAMI");
        arrivalAirport.forEach(System.out::println);

        List<InterchangeFlight> interchangeFlightsList = flightSearch.interchangeFlightSearch("WARSZAWA", "GDANSK");
        interchangeFlightsList.forEach(System.out::println);
    }
}
