package com.kodilla.good.patterns.challenges.flights;

public class InterchangeFlight {

    private Flight firstFlight;
    private Flight secondFlight;

    public InterchangeFlight(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }

    @Override
    public String toString() {
        return "InterchangeFlight{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}