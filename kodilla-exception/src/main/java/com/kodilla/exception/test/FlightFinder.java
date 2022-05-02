package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private Map<String , Boolean> timetable;

    public FlightFinder(Map<String, Boolean> timetable) {
        this.timetable = timetable;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        if(timetable.containsKey(flight.getArrivalAirport())){
            return timetable.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("ERROR: Arrival airport is not available");
        }
    }
}