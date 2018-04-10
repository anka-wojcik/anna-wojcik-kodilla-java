package com.kodilla.good.patterns.challenges.flightSearchChallenge;

import java.time.Duration;
import java.time.LocalTime;

public class FlightSearchRunner {

    public void runSearch(FlightSearchRequest flightSearchRequest) {

        RegularFlightsSchedule regularFlightsSchedule = new RegularFlightsSchedule();
        FlightSearch flightSearch = new FlightSearch();

        System.out.println("Selected route: " + flightSearchRequest.getChosenDepartureVenue() + " to " + flightSearchRequest.getChosenArrivalVenue());

        System.out.println("\nFlights departing from " + flightSearchRequest.getChosenDepartureVenue());
        flightSearch.searchFlightsFrom(regularFlightsSchedule.retrieve(), flightSearchRequest.getChosenDepartureVenue()).stream()
                .map(e -> "Departure time: " + e.getDepartureTime() + " flight no. " + e.getFlightNumber() + " to " + e.getArrivalVenue())
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nFlights arriving to " + flightSearchRequest.getChosenArrivalVenue());
        flightSearch.searchFlightsTo(regularFlightsSchedule.retrieve(), flightSearchRequest.getChosenArrivalVenue()).stream()
                .map(e -> "Arrival time: " + e.getArrivalTime() + " flight no. " + e.getFlightNumber() + " from " + e.getDepartureVenue())
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nConnections found on the chosen route:");
        flightSearch.searchConnectedFlights(regularFlightsSchedule.retrieve(), flightSearchRequest.getChosenDepartureVenue(), flightSearchRequest.getChosenArrivalVenue()).entrySet().stream()
                .map(e -> "Departure time: " + e.getKey().getDepartureTime()
                        + " flight no. " + e.getKey().getFlightNumber()
                        + " to " + e.getValue().getDepartureVenue()
                        + ", switch for plane no. " + e.getValue().getFlightNumber()
                        + ", total flight time "
                        + Duration.between(e.getValue().getArrivalTime(), e.getKey().getDepartureTime()).toString().substring(3)
                        + ", arriving at: "
                        + e.getValue().getArrivalTime())
                .sorted()
                .forEach(System.out::println);
    }
}
