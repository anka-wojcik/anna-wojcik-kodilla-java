package com.kodilla.good.patterns.challenges.flightSearchChallenge;

import java.time.LocalTime;

public class FlightSearchMain {

    public static void main(String[] args) {

        FlightSearchRunner flightSearchRunner = new FlightSearchRunner();
        FlightSearchRequest flightSearchRequest = new FlightSearchRequest("KRK", "CPH", LocalTime.of(15, 0));

        flightSearchRunner.runSearch(flightSearchRequest);
    }
}
