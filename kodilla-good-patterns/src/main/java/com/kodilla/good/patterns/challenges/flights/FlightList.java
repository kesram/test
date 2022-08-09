package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public static List<Flight> getListOfFlights(){
        List<Flight> flightBoard = new ArrayList<>();
        flightBoard.add(new Flight("WARSZAWA","KRAKOW",1111));
        flightBoard.add(new Flight("WARSZAWA","POZNAN",1112));
        flightBoard.add(new Flight("WARSZAWA","WROCLAW",1113));
        flightBoard.add(new Flight("WARSZAWA","GDANSK",1114));
        flightBoard.add(new Flight("WARSZAWA","KATOWICE",1115));
        flightBoard.add(new Flight("WARSZAWA","MIAMI",1116));
        flightBoard.add(new Flight("MIAMI","KRAKOW",2221));
        flightBoard.add(new Flight("MIAMI","POZNAN",2222));
        flightBoard.add(new Flight("MIAMI","BERLIN",2223));
        flightBoard.add(new Flight("MIAMI","PARYZ",2224));
        flightBoard.add(new Flight("MIAMI","RZYM",2225));
        flightBoard.add(new Flight("KRAKOW","POZNAN",3331));
        flightBoard.add(new Flight("KATOWICE","GDANSK",4441));
        flightBoard.add(new Flight("WROCLAW","MIAMI",5551));

        return new ArrayList<>(flightBoard);
    }
}
