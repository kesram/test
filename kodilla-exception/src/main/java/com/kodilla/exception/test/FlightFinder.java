package com.kodilla.exception.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> timetable = new HashMap<>();
        timetable.put("WAW", true);
        timetable.put("KAT", true);
        timetable.put("GDA", true);
        timetable.put("MIA", true);
        timetable.put("BER", true);
        timetable.put("PAR", true);
        timetable.put("WRO", true);
        timetable.put("MIE", true);
        timetable.put("GDK", true);
        timetable.put("MDR", true);
        timetable.put("KRK", true);
        timetable.put("ROM", true);

        if (timetable.containsKey(flight.getDepartureAirport()) && timetable.containsKey(flight.getArrivalAirport())) {
            System.out.println("Lotniska są dostępne");
        } else {
            throw new RouteNotFoundException("ERROR");
        }
    }

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("WAW", "ROM"));
        } catch (RouteNotFoundException e){
            System.out.println("ERROR");
        } finally {
            System.out.println("DATE SEARCH: " + LocalDate.now());
        }
    }
}