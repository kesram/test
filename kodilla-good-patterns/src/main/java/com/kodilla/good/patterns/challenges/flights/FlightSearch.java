package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    public List<Flight> departureSearch(String departure){
        return FlightList.getListOfFlights().stream()
                .filter(f->f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flight> arrivalSearch(String arrival){
        return FlightList.getListOfFlights().stream()
                .filter(f->f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public  List<InterchangeFlight> interchangeFlightSearch(String departure, String arrival){
        List<Flight> departureList = departureSearch(departure);
        List<Flight> arrivalList = arrivalSearch(arrival);

        return departureList.stream()
                .flatMap(f->arrivalList.stream()
                        .filter(g->g.getDeparture().equals(f.getArrival()))
                .map(g->new InterchangeFlight(f,g)))
                .collect(Collectors.toList());
    }
}
