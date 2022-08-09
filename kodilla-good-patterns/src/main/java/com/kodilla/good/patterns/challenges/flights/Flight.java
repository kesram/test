package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    private final String departure;
    private final String arrival;
    private final int flightNumber;

    public Flight(final String departure, final String arrival, final int flightNumber) {
        this.departure = departure;
        this.arrival = arrival;
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, flightNumber);
    }
}