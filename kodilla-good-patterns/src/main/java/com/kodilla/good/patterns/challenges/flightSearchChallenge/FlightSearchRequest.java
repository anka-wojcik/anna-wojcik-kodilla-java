package com.kodilla.good.patterns.challenges.flightSearchChallenge;

import java.time.LocalTime;

public class FlightSearchRequest {

    String chosenDepartureVenue;
    String chosenArrivalVenue;

    public FlightSearchRequest(String chosenDepartureVenue, String chosenArrivalVenue, LocalTime chosenDepartureTime) {
        this.chosenDepartureVenue = chosenDepartureVenue;
        this.chosenArrivalVenue = chosenArrivalVenue;
    }

    public String getChosenDepartureVenue() {
        return chosenDepartureVenue;
    }

    public String getChosenArrivalVenue() {
        return chosenArrivalVenue;
    }

}
