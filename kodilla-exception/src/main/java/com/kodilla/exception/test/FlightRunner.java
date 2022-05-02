package com.kodilla.exception.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("WAW", "KAT");
        Flight flight2 = new Flight("GDA", "MIA");
        Flight flight3 = new Flight("BER", "PAR");

        Map<String, Boolean> timetable = new HashMap<>();
        timetable.put("WAW", false);
        timetable.put("KAT", true);
        timetable.put("GDA", false);
        timetable.put("MIA", true);
        timetable.put("BER", true);
        timetable.put("PAR", false);

        FlightFinder flightFinder = new FlightFinder(timetable);
        try {
            flightFinder.findFlight(flight1);
            flightFinder.findFlight(flight2);
            flightFinder.findFlight(flight3);
            flightFinder.findFlight(new Flight("WAW", "BER"));
            flightFinder.findFlight(new Flight("WAW", "ROM"));
        } catch (RouteNotFoundException e){
            System.out.println("ERROR" + e);
        } finally {
            System.out.println("DATE SEARCH: " + LocalDate.now());
        }
    }
}
