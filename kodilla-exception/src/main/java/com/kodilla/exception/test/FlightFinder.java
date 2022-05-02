package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private Map<String , Boolean> timetable;

    public FlightFinder(Map<String, Boolean> timetable) {
        this.timetable = timetable;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (timetable.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException("ERROR: Arrival airport is not available");
        } else if (timetable.get(flight.getArrivalAirport())) {
            System.out.println(flight.getArrivalAirport() + " is on our list ");
        } else
            System.out.println(flight.getArrivalAirport() + " is not on our list ");
        return null;
    }
}