package com.kodilla.good.patterns.challenges.flightSearchChallenge;

import java.time.LocalTime;
import java.util.HashSet;

public class RegularFlightsSchedule {

    public HashSet<Flight> retrieve() {

        HashSet<Flight> regularFlightsSchedule = new HashSet<>();

        regularFlightsSchedule.add(new Flight("CP3591", "KRK", LocalTime.of(15, 20), "VIE", LocalTime.of(16, 25)));
        regularFlightsSchedule.add(new Flight("CP3581", "KRK", LocalTime.of(22, 20), "CPH", LocalTime.of(23, 50)));
        regularFlightsSchedule.add(new Flight("CP3582", "KRK", LocalTime.of(13, 25), "CPH", LocalTime.of(14, 55)));
        regularFlightsSchedule.add(new Flight("CP3487", "KRK", LocalTime.of(14, 40), "ZRH", LocalTime.of(16, 25)));
        regularFlightsSchedule.add(new Flight("CP3789", "KRK", LocalTime.of(18, 5), "WAW", LocalTime.of(18, 55)));
        regularFlightsSchedule.add(new Flight("CP3521", "VIE", LocalTime.of(17, 35), "CPH", LocalTime.of(19, 20)));
        regularFlightsSchedule.add(new Flight("CP3478", "ZRH", LocalTime.of(19, 10), "CPH", LocalTime.of(20, 55)));
        regularFlightsSchedule.add(new Flight("CP3791", "WAW", LocalTime.of(20, 30), "CPH", LocalTime.of(22, 0)));

        return regularFlightsSchedule;
    }
}
