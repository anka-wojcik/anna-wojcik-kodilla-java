package com.kodilla.good.patterns.challenges.flightSearchChallenge;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    public List<Flight> searchFlightsFrom(HashSet<Flight> flightsSchedule, String chosenDepartureVenue) {
        return flightsSchedule.stream()
                .filter(e -> e.getDepartureVenue().equals(chosenDepartureVenue))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightsTo(HashSet<Flight> flightsSchedule, String chosenArrivalVenue) {
        return flightsSchedule.stream()
                .filter(e -> e.getArrivalVenue().equals(chosenArrivalVenue))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightsDepartingAfterTime(HashSet<Flight> flightsSchedule, String chosenDepartureVenue, LocalTime departureTime) {
        return searchFlightsFrom(flightsSchedule, chosenDepartureVenue).stream()
                .filter(e -> e.getDepartureTime().isAfter(departureTime))
                .collect(Collectors.toList());
    }

    public HashMap<Flight, Flight> searchConnectedFlights(HashSet<Flight> flightsSchedule, String chosenDepartureVenue, String chosenArrivalVenue) {

        List<Flight> flightsFrom = searchFlightsFrom(flightsSchedule, chosenDepartureVenue);

        HashMap<Flight, Flight> connections = new HashMap<>();
        List<Flight> departuresAfterTimeConnections;

        for (Flight flight : flightsFrom) {
            departuresAfterTimeConnections = searchFlightsDepartingAfterTime(flightsSchedule, flight.getArrivalVenue(), flight.getArrivalTime());

            for (int i = 0; i < departuresAfterTimeConnections.size(); i++) {
                if (departuresAfterTimeConnections.get(i).getArrivalVenue().equals(chosenArrivalVenue)) {
                    connections.put(flight, departuresAfterTimeConnections.get(i));
                }
            }
        }
        return connections;
    }
}
