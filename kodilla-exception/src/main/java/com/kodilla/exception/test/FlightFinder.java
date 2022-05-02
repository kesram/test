package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private Map<String , Boolean> timetable;

    public FlightFinder(Map<String, Boolean> timetable) {
        this.timetable = timetable;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        Boolean result = timetable.get(flight.getArrivalAirport());
        if (result == null) {
            throw new RouteNotFoundException("ERROR: Arrival airport is not available");
        } else if (result) {
            System.out.println(flight.getArrivalAirport() + " is on our list ");
        } else
            System.out.println(flight.getArrivalAirport() + " is not on our list ");
        return result;
    }
}