package com.kodilla.exception.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("WAW", "KAT");
        Flight flight2 = new Flight("GDA", "MIA");
        Flight flight3 = new Flight("BER", "PAR");
        Flight flight4 = new Flight("WAW", "ROM");

        Map<String, Boolean> timetable = new HashMap<>();
        timetable.put("WAW", true);
        timetable.put("KAT", true);
        timetable.put("GDA", true);
        timetable.put("MIA", true);
        timetable.put("BER", true);
        timetable.put("PAR", false);

        FlightFinder flightFinder = new FlightFinder(timetable);
        try {
            flightFinder.findFlight(flight1);
            System.out.println(flight1.getArrivalAirport() + "->" + flightFinder.findFlight(flight1));
            flightFinder.findFlight(flight2);
            System.out.println(flight2.getArrivalAirport() + "->" + flightFinder.findFlight(flight2));
            flightFinder.findFlight(flight3);
            System.out.println(flight3.getArrivalAirport() + "->" + flightFinder.findFlight(flight3));
            flightFinder.findFlight(flight4);
            System.out.println(flight4.getArrivalAirport() + "->" + flightFinder.findFlight(flight4));

        } catch (RouteNotFoundException e){
            System.out.println("ERROR" + e);
        } finally {
            System.out.println("DATE SEARCH: " + LocalDate.now());
        }
    }
}
